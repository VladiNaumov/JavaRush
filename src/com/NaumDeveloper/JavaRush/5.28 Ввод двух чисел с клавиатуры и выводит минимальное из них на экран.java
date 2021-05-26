package com.NaumDeveloper.JavaRush;// 5.28 Ввод двух чисел с клавиатуры и выводит минимальное из них на экран.


/*
задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	В классе должен быть метод public static void main.
•	В классе должен быть метод public static min, принимающий 5 параметров типа int.
•	Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько - вернуть любое из них.
•	Программа должна выводить строку, которая начинается на "Minimum = ".
•	Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b,int c,int d,int e) {
        int min = 999;
        if (a<min)
            min = a;
        if (b<min)
            min = b;
        if (c<min)
            min = c;
        if (d<min)
            min = d;
        if (e<min)
            min = e;
        return min;

    }
}











