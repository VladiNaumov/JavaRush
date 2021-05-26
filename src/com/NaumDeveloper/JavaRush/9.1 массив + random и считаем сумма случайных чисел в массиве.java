package com.NaumDeveloper.JavaRush;9.1 массив + random и считаем сумма случайных чисел в массиве

public class Main {

    public static void main(String[] args) {

            double evg =0;
            int[]mas = new int [10];
            for (int j =0; j<mas.length; j++){
                mas[j]=(int) (Math.random()*10); // случайные числа в лиапозоне до 10
                System.out.print(mas[j] + " ");
                evg+=mas[j];

            }

            evg+=mas.length; // сумма всех чисел в массиве
            System.out.println();
            System.out.println("evg= " + evg);
    }

