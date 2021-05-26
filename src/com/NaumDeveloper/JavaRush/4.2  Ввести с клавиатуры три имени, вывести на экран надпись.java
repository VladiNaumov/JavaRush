package com.NaumDeveloper.JavaRush;// 3.17  Ввести с клавиатуры имя и вывести надпись

/*
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

 */

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine(); // считывает данные с клавиатуры
        String name2 = reader.readLine(); // считывает данные с клавиатуры
        String name3 = reader.readLine(); // считывает данные с клавиатуры

        System.out.println(name1 + " " +name2 + " " + name3 + " = Чистая любовь, да-да!");//напишите тут ваш код
    }
}


