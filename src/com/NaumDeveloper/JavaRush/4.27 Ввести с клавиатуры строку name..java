package com.NaumDeveloper.JavaRush;// 4.27 Ввести с клавиатуры строку name.

/*

Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988

 */

import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();


        String age2 = reader.readLine();
        String age1 = reader.readLine();
        String age0 = reader.readLine();

        System.out.println ("Меня зовут " + name + ".");
        System.out.println ("Я родился " + age0 + "." + age1 + "." + age2);
    }
}




