package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;
import com.jcourse.makeev.calculator.In;
import com.jcourse.makeev.calculator.InjectType;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 04.02.13
 * Time: 14:01
 * To change this template use File | Settings | File Templates.
 */
public class Sqrt implements Command {
    @In(type = InjectType.STACK)
    private Stack<Double> stack;

    @Override
    public void execute(String[] comAndArg) {
        if (comAndArg.length == 1){
            double num;
            try{
                num = (Double) stack.pop();
                stack.push(Math.sqrt(num));
            }catch (EmptyStackException e){
                new ErrorCal("стек пуст");
            }
        }else {
            new ErrorCal("количество аргументов");
        }
    }
}
