package com.NaumDeveloper.JavaRush;//7.2 Массив из строчек в обратном порядке


/*

1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна считывать 8 строк для массива с клавиатуры.
•	Программа должна выводить на экран 10 строк, каждую с новой строки.
•	Программа должна выводить на экран массив (10 элементов) в обратном порядке.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      
        BufferedReader h = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        array[0] = "A";
        array[1] = "B";

        for (int i = 2; i < array.length; i++)
            array[i] = h.readLine();

        for (int i = 9; i >= 0; i--)
            System.out.println(array[i]);
    }
}