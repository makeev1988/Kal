package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;

import java.util.EmptyStackException;
import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 04.02.13
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
public class Sqrt implements Command {

    @Override
    public void execute(String arg, String getName, Stack<Double> stack, Map<String,Double> m) {
        double num;
        try{
           num = (Double) stack.pop();
           stack.push(Math.sqrt(num));
        }catch (EmptyStackException e){
            new ErrorCal("стек пуст");
        }
    }
}
