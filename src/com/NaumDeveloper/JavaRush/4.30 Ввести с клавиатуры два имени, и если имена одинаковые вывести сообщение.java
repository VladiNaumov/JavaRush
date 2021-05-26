package com.NaumDeveloper.JavaRush;// 4.30 Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение

/*

Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

 */

import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        int len1 = name1.length();
        String name2 = reader.readLine();
        int len2 = name2.length();

        if(name1.equals(name2)){
            System.out.println("Имена идентичны");
        } else if(len1 == len2){
            System.out.println("Длины имен равны");
        }
    }
}








