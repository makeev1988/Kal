package com.jcourse.makeev.task1;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 31.01.13
 * Time: 0:56
 * To change this template use File | Settings | File Templates.
 */
public class Echo {
    public static void main (String[] args) throws IOException {

        byte[] b = new byte[128];

        String encoding = System.getProperty("file.encoding");

        System.out.println( encoding );

        while (true){
            int count = System.in.read(b);
            String s = new String(b, 0, count, encoding);
            System.out.println(s);
        }


    }
}
