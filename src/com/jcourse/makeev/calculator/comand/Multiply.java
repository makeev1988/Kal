package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;

import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 04.02.13
 * Time: 13:48
 * To change this template use File | Settings | File Templates.
 */
public class Multiply implements Command {
    @Override
    public void execute(String arg, String getName, Stack stack, Map m) {
        //To change body of implemented methods use File | Settings | File Templates.
        double num1, num2;
        if (stack.size() < 2){
            new ErrorCal("в стеке меньше 2");
        }
        else {
            num1 = (Double) stack.pop();
            num2 = (Double) stack.pop();
            stack.push(num2 * num1);
        }

    }
}
