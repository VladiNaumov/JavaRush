package com.NaumDeveloper.JavaRush;// 4.25 Существует ли пара? Ввести с клавиатуры три целых числа

/*

Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.
 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine()); // ввод данных с клавиатуры
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a==b && a==c) System.out.println(a + " " + b + " " + c);
        else{
            if (a==b) System.out.println(a + " " + b);
            if (a==c) System.out.println(a + " " + c);
            if (c==b) System.out.println(c + " " + b);
        }



    }
}




