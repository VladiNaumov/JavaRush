package com.NaumDeveloper.JavaRush;// 3.12 метод convertEurToUsd

/*

Обмен валют

Напиши код метода convertEurToUsd, который переводит евро в доллары по заданному курсу.
Для возврата результата из метода convertEurToUsd используй оператор return.


Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс

 */


public class Main {

    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 2.67)); 
        System.out.println(convertEurToUsd(500, 45.67));
    }


    public static double convertEurToUsd(int eur, double course) {

       double долларСША = eur * course;
       return долларСША;

    }
}