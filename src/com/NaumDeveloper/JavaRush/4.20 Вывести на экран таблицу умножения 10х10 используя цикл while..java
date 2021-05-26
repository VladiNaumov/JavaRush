package com.NaumDeveloper.JavaRush;// 4.20 Вывести на экран таблицу умножения 10х10 используя цикл while.

/*
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.

 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {

        int a = 0;
        while (a < 10) {
            a++;
            int b = 0;
            while (b < 10) {
                b++;
                System.out.print(a * b + " ");
            }
            System.out.println();
        }

    }
}