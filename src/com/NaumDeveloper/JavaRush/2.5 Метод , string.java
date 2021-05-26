package com.NaumDeveloper.JavaRush;// 2.5 Метод , string


/*

Реализуй метод print3. Метод должен вывести на экран переданную строку 3 раза.
Каждый раз с новой строки.

*/

class Solution {


    public static void print3(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}