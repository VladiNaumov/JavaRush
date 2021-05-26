package com.NaumDeveloper.JavaRush;// 4.15 Ввести с клавиатуры три целых числа

/*

Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6: -1

Пример для чисел 6 6 3: -3
 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt( reader.readLine()); // для хранения целых чисел
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());


         if (a != b && b == c) {System.out.println(1);}
         if (b != a && a == c) {System.out.println(2);}
         if (c != a && a == b) {System.out.println(3);}



        }
    }


