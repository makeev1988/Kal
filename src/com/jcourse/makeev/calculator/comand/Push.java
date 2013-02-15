package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;
import com.jcourse.makeev.calculator.In;
import com.jcourse.makeev.calculator.InjectType;

import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 02.02.13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class Push implements Command{
    @In(type = InjectType.DEFINE)
    private Map<String,Double> m;

    @In(type = InjectType.DEFINE)
    private Stack<Double> stack;

    @Override
    public void execute(String[] comAndArg) {
        if (comAndArg.length == 2){
            try {
                double value = m.get(comAndArg[1]);
                stack.push(value);
            }catch (NullPointerException e){
                try {
                    stack.push(Double.parseDouble(comAndArg[1]));
                }catch (Exception e2) {
                    new ErrorCal("push");
                }
            }
        }else {
            new ErrorCal("количество аргументов");
        }

    }
}
