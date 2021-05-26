package com.NaumDeveloper.JavaRush;// 4.12 Ввести с клавиатуры номер дня недели
/*

Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt( reader.readLine()); // для хранения целых чисел

        if (a == 1) { System.out.println("понедельник"); }
        if (a == 2) { System.out.println("вторник"); }
        if (a == 3) { System.out.println("среда"); }
        if (a == 4) { System.out.println("четверг"); }
        if (a == 5) { System.out.println("пятница"); }
        if (a == 6) { System.out.println("суббота"); }
        if (a == 7) { System.out.println("воскресенье"); }


        if (a > 7 || a < 1)  System.out.println("такого дня недели не существует");

        }
    }


