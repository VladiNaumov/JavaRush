package com.NaumDeveloper.JavaRush;// 4.34 четное однозначное число" - если число четное и нечетное

/*

Описываем числа

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2

*/


import java.io.*;




    public class Main {


            public static void main(String[] args) throws Exception {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader.readLine());
                int b = Integer.parseInt(reader.readLine());
                int c = Integer.parseInt(reader.readLine());

                int count = 0;


                if (a > 0)

                    count ++;

                if (b > 0)

                    count ++;

                if (c > 0)

                    count ++;

                System.out.println(count);

            }
    }








