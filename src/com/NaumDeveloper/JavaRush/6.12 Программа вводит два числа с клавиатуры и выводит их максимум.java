package com.NaumDeveloper.JavaRush;// 6.12 Программа вводит два числа с клавиатуры и выводит их максимум

/*

Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".

Требования:
Программа должна считывать данные с клавиатуры.
Программа должна выводить результат на экран.
Текст выведенный на экран должен начинаться с «The max is».
Текст выведенный на экран должен заканчиваться максимумом из 2х введенных чисел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String maximum = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max = a > b ? a : b;

        System.out.println(maximum + max);
    }

}
