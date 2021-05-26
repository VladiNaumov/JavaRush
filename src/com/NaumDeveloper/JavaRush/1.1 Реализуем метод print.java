package com.NaumDeveloper.JavaRush;// 1.2 Реализуем метод print

/* В методе print выведи на экран переданную строку 4 раза.
Каждый раз с новой строки.
 */




class Solution {
    public static void main(String[] args) {
        print("Java easy to learn!");
        print("Java opens many opportunities!");
    }

    public static void print(String s) {
        System.out.println (s);
        System.out.println (s);
        System.out.println (s);
        System.out.println (s);
    }
}


