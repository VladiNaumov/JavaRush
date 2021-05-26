package com.NaumDeveloper.JavaRush;// 5.29 Задача по алгоритмам


/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	Программа должна выводить число на экран.
•	В классе должен быть метод public static void main.
•	Нельзя добавлять новые методы в класс Solution.
•	Программа должна выводить на экран максимальное из введенных N чисел.
*/

import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int maximum =-2147483648;



        if (n>0) {
            for(int i=1;i<=n;i++){
                int next=Integer.parseInt(reader.readLine());
                if (next>maximum)
                    maximum=next;
            }
            System.out.println(maximum);
        }
    }


}










