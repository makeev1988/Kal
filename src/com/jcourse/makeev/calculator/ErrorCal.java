package com.jcourse.makeev.calculator;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 08.02.13
 * Time: 13:43
 * To change this template use File | Settings | File Templates.
 */
public class ErrorCal {
    HashMap<String, String> listError = new HashMap<>();
    {
        listError.put("push","Значение не определено, нельзя положить в стек.");
        listError.put("стек пуст","Не удается выполнить операцию, в среке пусто.");
        listError.put("в стеке меньше 2","Не удается выполнить операцию, в среке недостаточно элементов.");
        listError.put("define","Не корректное определение.");
    }
    public ErrorCal(String typeError){
        System.out.println(listError.get(typeError));
    }
}
