package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;
import com.jcourse.makeev.calculator.In;
import com.jcourse.makeev.calculator.InjectType;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 04.02.13
 * Time: 13:23
 * To change this template use File | Settings | File Templates.
 */
public class Minus implements Command {
    @In(type = InjectType.DEFINE)
    private Stack<Double> stack;

    @Override
    public void execute(String[] comAndArg) {
        double num1, num2;
        if (comAndArg.length == 1){
            if (stack.size() < 2){
                new ErrorCal("в стеке меньше 2");
            }
            else {
                num1 = (Double) stack.pop();
                num2 = (Double) stack.pop();
                stack.push(num2 - num1);
            }
        }else {
            new ErrorCal("количество аргументов");
        }
    }
}
