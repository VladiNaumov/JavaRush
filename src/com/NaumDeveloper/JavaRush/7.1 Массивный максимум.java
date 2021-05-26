package com.NaumDeveloper.JavaRush;//7.1 Массивный максимум

/*
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

Требования:
•	Метод initializeArray должен создавать массив из 20 целых чисел.
•	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
•	Метод max должен возвращать максимальный элемент из переданного массива.
•	Метод main изменять нельзя.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Задачи на создание и использование массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

   public static int[] initializeArray() throws IOException {
         
        int []array = new int[20];
        for(int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
       
        int max = array[1];
        for(int i = 0; i < 20; i++)
        if(array[i] > max) max = array[i];
        return max;
    }
}