package com.NaumDeveloper.JavaRush;// 6.14  Числа по возрастанию

/*

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

Требования:
•	Программа должна считывать 5 чисел с клавиатуры.
•	Программа должна выводить 5 чисел, каждое с новой строки.
•	Выведенные числа должны быть отсортированы по возрастанию.
•	Вывод должен содержать те же числа, что и были введены (порядок не важен).

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Числа по возрастанию
*/



public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)Integer.parseInt(reader.readLine());
        }
        Arrays.sort(arr);
        for ( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}