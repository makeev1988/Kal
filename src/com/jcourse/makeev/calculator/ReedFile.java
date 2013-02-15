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



