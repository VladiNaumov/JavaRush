package com.NaumDeveloper.JavaRush;// 3.15  ввод данных с клавиатуры

/*
Напиши код метода sumDigitsInNumber(int number).
Метод на вход принимает целое трехзначное число.
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

		// пишим метод с параметрами
    public static int sumDigitsInNumber(int number) {
        String text = Integer.toString(number);

        char[] array = text.toCharArray();

        String x = String.valueOf(array[0]);
        String y = String.valueOf(array[1]);
        String z = String.valueOf(array[2]);

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);

        return (a + b + c);

    }

}
