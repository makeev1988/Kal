package com.jcourse.makeev.task2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Alexey
 * Date: 31.01.13
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */
public class Comparison {

    static void printResult (int i, int r ){
        switch (i){
            case 1:
                System.out.println("Загаданное число меньше");
            break;
            case 2:
                System.out.println("Загаданное число больше");
            break;
            case 3:
                System.out.println("Угадал");
            break;
            case 4:
                System.out.println("Проиграл, правильный ответ: " + r);
            break;
        }
    }

    public static void main (String[] args){

        Random r = new Random();
        int n = 1 + r.nextInt(99);

        UnknownNumber numUser = new UnknownNumber(n);

        Scanner sc = new Scanner(System.in);

        int user = 0;
        int result = 0;

        while (result != 4 && result != 3 ){

            if (sc.hasNextInt()){
                user = sc.nextInt();
                result = numUser.equal(user);
                Comparison.printResult(result, n);
            }
            else {
                sc.next();
                System.out.println("Вы ввели не целое число!!!");
            }
        }
    }
}
