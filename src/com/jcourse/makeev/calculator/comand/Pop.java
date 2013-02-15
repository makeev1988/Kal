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
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 */
public class Pop implements Command {

    @Override
    public void execute(String arg, String getName, Stack stack, Map m) {
        try{
            stack.pop();
        }catch (EmptyStackException e){
            new ErrorCal("стек пуст");
        }
    }
}
