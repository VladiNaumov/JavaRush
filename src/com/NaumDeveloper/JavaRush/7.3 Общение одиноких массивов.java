package com.NaumDeveloper.JavaRush;// 7.3 Общение одиноких массивов

/* 

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать строки для массива с клавиатуры.
•	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner (System.in);
      
        
        
        int[] numbers = new int[10];
        String[] stroki = new String[10];

        for(int i = 0 ; i < str.length ; i++){
            String s = scanner.nextLine ();
            stroki[i] = s;
        }
        for (int i = 0 ; i < numbers.length ; i++){
            numbers[i] = str[i].length ();
            System.out.println(numbers[i]);
        }

    }
}