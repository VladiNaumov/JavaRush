package com.NaumDeveloper.JavaRush;// 3.12 метод  addTenPercent

/*

Задача на проценты

Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
Для возврата результата из метода addTenPercent используй оператор return.

 */


public class Main {

    public static double addTenPercent(int i) {
        double korko =   i + (i * 0.10);
        return korko;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}