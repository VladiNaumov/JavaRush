package com.NaumDeveloper.JavaRush;// 4.18 Ввести с клавиатуры строку и число N. используя цикл while.

/*

Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Каждое значение с новой строки.

 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine(); // ввод строки
        int a = Integer.parseInt( reader.readLine()); // для хранения целых чисел

        int c=0;

        while (c < a) {
            c++;
            System.out.println(b);

        }


        }
    }

