package com.NaumDeveloper.JavaRush;// 1.2  Методы int

/*
В методе public static void hackSalary(int a) увеличь зарплату на 100 и выведи на экран надпись:
"Твоя зарплата составляет: <a+100> долларов в месяц."

Где <a+100> - это зарплата увеличенная на 100.

 */




class Solution {

        public static void main(String[] args) {
            hackSalary(700);
        }

        public static void hackSalary(int a) {
            int b = a+ 100;
            System.out.println("Твоя зарплата составляет: " + b + "  долларов в месяц.");
        }
    }




