package com.NaumDeveloper.JavaRush;// 3.21  Ввести с клавиатуры три числа, и вывести их в порядке убывания.

/*
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
 */

import java.io.*;


public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt( reader.readLine());
        int b = Integer.parseInt( reader.readLine());
        int c = Integer.parseInt( reader.readLine());

        int num1 =0;
        int num2 =0;
        int num3 =0;

        if (a > b && a > c){
            num1 = a;
        } else if (b > a && b > c){
            num1 = b;
        } else if (c > a && c > b){
            num1 = c;
        }
        if (a > b && a < c){
            num2 = a;
        } else if (b > a && b < c) {
            num2 = b;
        } else if (c > a && c < b){
            num2 = c;
        }
        if (a < b && a < c){
            num3 = a;
        } else if (b < a && b < c){
            num3 = b;
        } else if (c < a && c < b){
            num3 = c;
        }
        System.out.println(num1 +" "+ num2 +" "+ num3);


//Если c1 < c2 - меняем их местами
//Если c2 < c3 - меняем их местами
//Если c1 < c2 - меняем их местами//напишите тут ваш код
    }
}
