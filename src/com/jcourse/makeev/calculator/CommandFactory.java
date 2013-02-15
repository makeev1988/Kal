package com.jcourse.makeev.calculator;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 06.02.13
 * Time: 19:06
 * To change this template use File | Settings | File Templates.
 */
public class CommandFactory {
    private Map<String, Command> commandMap = new HashMap<>();

    public CommandFactory() throws IOException {

        Properties p = new Properties();
        try (InputStream in = CommandFactory.class.getResourceAsStream("commands.properties")) {
            p.load(in);
        }
        for (Enumeration e = p.propertyNames(); e.hasMoreElements(); ){
            String commandName = (String) e.nextElement();
            String className = p.getProperty(commandName);
            try {
                Command cmd = (Command) Class.forName(className).newInstance();
                commandMap.put(commandName, cmd);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    public Command getCom(String commandName) {
        return commandMap.get(commandName);
    }

}
