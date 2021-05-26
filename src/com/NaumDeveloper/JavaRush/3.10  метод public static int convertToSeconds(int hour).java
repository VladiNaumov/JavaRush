package com.NaumDeveloper.JavaRush;// 3.16  метод public static int convertToSeconds(int hour)

/*
Конвертируем время

Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

 */



public class Main {

    public static int convertToSeconds(int hour) {
        int second = hour * 3600;
        return second;

    }
    public static void main (String[] args) {
            System.out.println(convertToSeconds(2));
            System.out.println(convertToSeconds(3));

        }

    }

