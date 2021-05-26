package com.NaumDeveloper.JavaRush;// 3.18  метод возвращал число полных метров в centimetre.

/*
Реализуй метод getMetreFromCentimetre(int centimetre).
Метод на вход принимает количество сантиметров.
Нужно сделать так, чтобы метод возвращал число полных метров в centimetre.
(1 метр = 100 см).

Пример:
Метод getMetreFromCentimetre вызывается с параметром 243.



 */

import java.io.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));

    }

    public static int getMetreFromCentimetre(int centimetre) {
        int metre=centimetre/100;
        return metre;
    }
}