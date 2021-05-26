package com.NaumDeveloper.JavaRush;// 4.16 Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY

/*

Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt( reader.readLine()); // для хранения целых чисел
        int b = Integer.parseInt(reader.readLine());



        if (a > 0 && b > 0){ System.out.println(1);}
        if (a < 0 && b > 0){ System.out.println(2);}
        if (a < 0 && b < 0){ System.out.println(3);}
        if (a > 0 && b < 0){ System.out.println(4);}


        }
    }

