package com.NaumDeveloper.JavaRush;// 3.15  Цикл while и приметивы

/*
Задачи на вывод

Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):

 */



public class Main {


        public static void main(String[] args) {

            int a = 1;
            int b = 2;
            int count = 1;

            System.out.println(a);

            while(count <= 4) {
                a = a + b;
                System.out.println(a);
                b++;
                count++;
            }

        }
}