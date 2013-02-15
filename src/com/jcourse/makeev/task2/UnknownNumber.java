package com.jcourse.makeev.task2;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 31.01.13
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class UnknownNumber {
    private int userNum; //число которое вводит пользователь
    private int randNum; //число которое пытается угадать пользователь
    private int count;   //счетчик для колличества попыток

    UnknownNumber(int b){
        randNum = b;
    }

    //проверка числа
    public int equal (int a){
    userNum  = a;
    count++;
        if (userNum > randNum && count < 8){
            return 1;   //число больше загадонного и количество попыток меньше 8
        }
        else if (userNum < randNum && count < 8){
            return 2;   //число меньше загадонного и количество попыток меньше 8
        }
        else if(userNum == randNum && count <= 8) {
            return 3;   //числа равны опыток не больше 8
        }
        else {
            return 4;
        }
    }
}
