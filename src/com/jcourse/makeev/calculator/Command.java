package com.jcourse.makeev.calculator;

import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 02.02.13
 * Time: 14:39
 * To change this template use File | Settings | File Templates.
 */
public interface Command {
    void execute(String arg, String getName, Stack<Double> stack, Map<String, Double> m);
}
