package com.NaumDeveloper.JavaRush;// 6.07 Класс ConsoleReader

/*
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() - читает с клавиатуры строку
int readInt() - читает с клавиатуры число
double readDouble() - читает с клавиатуры дробное число
boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.

Требования:
•	Метод readString должен считывать и возвращать строку(тип String).
•	Метод readInt должен считывать и возвращать число(тип int).
•	Метод readDouble должен считывать и возвращать дробное число(тип double).
•	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).

*/


import java.util.Scanner;

public class Main {

    public static String readString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;

    }

    public static int readInt() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        return b;

    }

    public static double readDouble() throws Exception {
        Scanner scanner = new Scanner(System.in);
        double c = scanner.nextDouble();
        return c;

    }

    public static boolean readBoolean() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean d = scanner.nextBoolean();
        return d;

    }

    public static void main(String[] args) {

    }
}

