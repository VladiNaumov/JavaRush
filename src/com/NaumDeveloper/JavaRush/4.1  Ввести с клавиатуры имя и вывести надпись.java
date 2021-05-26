package com.NaumDeveloper.JavaRush;// 3.16  Ввести с клавиатуры имя и вывести надпись

/*
Ввести с клавиатуры имя и вывести надпись:
"name" зарабатывает $5,000. Ха-ха-ха!

 */

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");//напишите тут ваш код
    }
}


