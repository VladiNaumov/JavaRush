package com.NaumDeveloper.JavaRush;// 7.5 Один большой массив и два маленьких

/*
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести его на экран.
*/

import java.util.Scanner;


public class Main {


    public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in); // luketaan dannih nappamistosta
            int[] list_iso = new int[20];
            int[] list_a = new int[10];
            int[] list_b = new int[10];

            for (int i = 0; i < list_iso.length; i++){ // zapolnenie massiva
                list_iso[i] = sc.nextInt();}


        //вывод на экран

            System.out.println("Вывод массива на экран");
            for (int i = 0; i < list_iso.length; i++)
            System.out.print(list_iso[i]+ " ");
            System.out.println();

        //копировка массива в первых маленький

        System.arraycopy(list_iso, 0, list_a, 0, 10);
        for (int i=0; i < list_a.length; i++) {
            System.out.print(list_a[i] + " ");
        }
        System.out.println();

        //копировка массива в второй маленький

        System.arraycopy(list_iso, 10, list_b, 0, 10);
        for (int i=0; i < list_b.length; i++) {
            System.out.print(list_b[i] + " ");
        }
        System.out.println();

        }
    }
