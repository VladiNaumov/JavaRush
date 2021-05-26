package com.NaumDeveloper.JavaRush;// 1.3  Методы,  приметивы типа double

/*
Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.

 */




class Solution {

    public static void main(String[] args) {
        printCircleLength(5);

    }

    public static void printCircleLength(int radius) {
        double pi= 3.14;
        double l = 2 * pi * radius;
        System.out.println(l);

    }
}