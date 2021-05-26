package com.NaumDeveloper.JavaRush;// 6.10 класс Calculator, у которого будут 5 статических методов

/*

Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов из числа a

Требования:
Метод plus должен возвращать сумму чисел a и b.
Метод minus должен возвращать разницу чисел a и b.
Метод multiply должен возвращать результат умножения числа a на число b.
Метод division должен возвращать результат деления числа a на число b.
Метод percent должен возвращать b процентов из числа a.

*/


import java.io.*;

public class Main {

        public static int plus(int a, int b) {
            int plus = a + b;
            return plus;
        }

        public static int minus(int a, int b) {
            int minus = a - b;
            return minus;
        }

        public static int multiply(int a, int b) {
            int multiply = a * b;
            return multiply;
        }

        public static double division(int a, int b) {
            double division = (double) a / (double) b;
            return division;
        }

        public static double percent(int a, int b) {
            double percent = ((double) a * (double) b) / 100;
            return percent;
        }

    public static void main(String[] args) {

    }
}



