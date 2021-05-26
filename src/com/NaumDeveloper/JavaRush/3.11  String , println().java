package com.NaumDeveloper.JavaRush;// 3.17  String , println()

/*
Для сложности: внутри метода print/println должны фигурировать только переменные.

Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

 */



public class Main {


    public static void main (String[] args) {
        String s1 = "Мама";
        String s2 = "Мыла";
        String s3 = "Раму";
        System.out.println(s1+s2+s3);
        System.out.println(s1+s3+s2);
        System.out.println(s2+s1+s3);
        System.out.println(s2+s3+s1);
        System.out.println(s3+s1+s2);
        System.out.println(s3+s2+s1);

        }

    }

