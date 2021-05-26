package com.NaumDeveloper.JavaRush;// 2.6 Метод , if


/*

Написать функцию, которая возвращает минимум из двух чисел.

Подсказка:
Нужно написать тело существующей функции min.


*/

class Solution {


    public static int min(int a, int b) {
        if (a < b)
            return a;

        if (a > b) ;
           return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}