package com.jcourse.makeev.calculator.comand;

import com.jcourse.makeev.calculator.Command;
import com.jcourse.makeev.calculator.ErrorCal;
import com.jcourse.makeev.calculator.In;
import com.jcourse.makeev.calculator.InjectType;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 02.02.13
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class Define implements Command {
   @In(type = InjectType.DEFINE)
   private Map<String,Double> m;

    @Override
    public void execute(String arg, String getName) {
        if (arg==null || getName==null ){
            new ErrorCal("define");
        }else {
            m.put(arg, Double.parseDouble(getName));
        }
    }
}
