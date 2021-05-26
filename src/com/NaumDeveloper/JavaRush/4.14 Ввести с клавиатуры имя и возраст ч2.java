package com.NaumDeveloper.JavaRush;// 4.14 Ввести с клавиатуры имя и возраст ч2

/*

Если возраст больше 20 вывести надпись "И 18-ти достаточно".

 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String b = reader.readLine(); // ввод строки
        int a = Integer.parseInt( reader.readLine()); // для хранения целых чисел

        if (a > 20) { System.out.println("И 18-ти достаточно"); }



        }
    }


