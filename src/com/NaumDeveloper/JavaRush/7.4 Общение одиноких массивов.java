package com.NaumDeveloper.JavaRush;// 7.4 Общение одиноких массивов

/*

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна выводить 10 строчек, каждую с новой строки.
•	Массив должен быть выведен на экран в обратном порядке.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in); // luketaan dannih nappamistosta 
           int[] list = new int[10];

    for (int i = 0; i < list.length; i++){ // zapolnenie massiva 
      list[i] = sc.nextInt();}
      
     for (int i=list.length-1; i > 0; i--){}
      
      
     for (int i =list.length-1;i>=0;i--){ //tulos dannih arraysta
            System.out.println(list[i]);
        }
    }
}