package com.NaumDeveloper.JavaRush;// 4.13 Ввести с клавиатуры имя и возраст.

/*

Если возраст меньше 18 вывести надпись "Подрасти еще".

 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine(); // ввод строки
        int a = Integer.parseInt( reader.readLine()); // для хранения целых чисел

        if (a < 18) { System.out.println("Подрасти еще"); }


        }
    }


