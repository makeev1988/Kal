package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;

import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 02.02.13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class Push implements Command {

    @Override
    public void execute(String arg, String getName, Stack<Double> stack, Map<String, Double> m) {
        try {
            double value = m.get(arg);
            stack.push(value);
        }catch (NullPointerException e){
            try {
                stack.push(Double.parseDouble(arg));
            }catch (Exception e2) {
                new ErrorCal("push");
            }
        }
    }
}
