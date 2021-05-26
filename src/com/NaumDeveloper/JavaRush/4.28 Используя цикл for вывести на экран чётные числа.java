package com.NaumDeveloper.JavaRush;// 4.28 Используя цикл for вывести на экран чётные числа

/*

Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.

 */

import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {

        int a = 0;
        for (int i = 0; i < 50; i++) {
            a = a + 1;
            System.out.println(a * 2);
        }

    }
}

