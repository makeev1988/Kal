package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;

import java.util.Map;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 02.02.13
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class Define implements Command {

    @Override
    public void execute(String arg, String getName, Stack<Double> stack, Map<String,Double> m) {
        if (arg==null || getName==null ){
            new ErrorCal("define");
        }else {
            m.put(arg, Double.parseDouble(getName));
        }
    }
}
