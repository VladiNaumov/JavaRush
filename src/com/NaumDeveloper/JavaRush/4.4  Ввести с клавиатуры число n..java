package com.NaumDeveloper.JavaRush;// 3.19  Ввести с клавиатуры число n.

/*
Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час

 */

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);
        System.out.println("Я буду зарабатывать " + nNumber + "$ в час");
    }


}