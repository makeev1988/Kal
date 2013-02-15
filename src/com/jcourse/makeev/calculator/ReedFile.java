package com.jcourse.makeev.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 06.02.13
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
public class ReedFile {
    private boolean indicator = true;
    BufferedReader in;

    public ReedFile(InputStream inFile) {
        in = new BufferedReader(new InputStreamReader(inFile));
    }

    String getNextSting() throws IOException {
        String s = in.readLine();
        return s;
    }
}


//    ReedFile(String nameFile) {
//        Stack stack = new Stack();
//        HashMap m = new HashMap();              //карта определений
//
//        HashMap listCommmand = new HashMap();   //Карта команд
//        listCommmand.put("#", new Comment());
//        listCommmand.put("PUSH", new Push());
//        listCommmand.put("POP", new Pop());
//        listCommmand.put("PRINT", new Print());
//        listCommmand.put("+", new Plus());
//        listCommmand.put("-", new Minus());
//        listCommmand.put("*", new Multiply());
//        listCommmand.put("/", new Divide());
//        listCommmand.put("SQRT", new Sqrt());
//        listCommmand.put("DEFINE", new Define());
//
//        BufferedReader in;
//        try {
//            in = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\Text\\"+nameFile)));
//            while (in.ready()) {
//                String s = in.readLine();
//                s = s.trim();
//                String[] st = s.split(" ");
//
//                Command c = (Command) listCommmand.get(st[0].toUpperCase());
//
//                if (c == null){
//                    System.out.println("Неизвестная команда");
//                    continue;
//                }
//                String arg1=null, arg2=null;
//                if (st.length > 1){
//                    arg1 = st[1];
//                }
//
//                if (st.length > 2){
//                    arg2 = st[2];
//                }
//
//                c.execute(arg1, arg2, stack, m);
//
//            }
//        } catch (IOException e) {
//            System.out.println("Нет такого файла " + nameFile);
//            indicator = false;
//
//        }
//    }
//    boolean getIndicator (){
//        return indicator;
//    }


