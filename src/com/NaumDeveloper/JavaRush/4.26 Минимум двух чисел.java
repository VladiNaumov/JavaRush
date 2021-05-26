package com.NaumDeveloper.JavaRush;// 4.26 Минимум двух чисел

/*

Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

 */

import java.io.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            if (a < b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }



