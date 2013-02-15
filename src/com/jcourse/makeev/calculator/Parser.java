package com.jcourse.makeev.calculator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 02.02.13
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class Parser {
    public static void main (String arg[]) throws IOException {
        final Stack <Double> stack = new Stack<>();
        final HashMap<String,Double> m = new HashMap<>();              //карта определений

        CommandFactory factory = new CommandFactory(new CmdInit() {
            @Override
            public void initCommand(Command cmd) {
               Class cls = cmd.getClass();
               Field[] f = cls.getDeclaredFields();
               for(Field current: f){

                   In inType = current.getAnnotation(In.class);

                   if (inType != null){
                       if (inType.type() == InjectType.DEFINE){
                           try {
                               current.setAccessible(true);
                               current.set(cmd,m);
                           } catch (IllegalAccessException e) {
                               e.printStackTrace();
                           }
                       }else if (inType.type() == InjectType.STACK){
                           try {
                               current.setAccessible(true);
                               current.set(cmd,stack);
                           } catch (IllegalAccessException e) {
                               e.printStackTrace();
                           }
                       }
                   }

               }
            }
        });

        InputStream in = System.in;

        if (arg.length > 0) {
            try {
                in = new FileInputStream(arg[0]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Файл не найден");
            }
        }

        ReedFile rf = new ReedFile(in);

        String s;
        try {
            while ( (s = rf.getNextSting()) != null) {
                s = s.trim();
                String[] comAndArg = s.split(" ");

                Command currentCom =  factory.getCom(comAndArg[0].toUpperCase());

                if (currentCom == null){
                    System.out.println("Неизвестная команда");
                    continue;
                }
                currentCom.execute(comAndArg);
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        in.close();
    }
}