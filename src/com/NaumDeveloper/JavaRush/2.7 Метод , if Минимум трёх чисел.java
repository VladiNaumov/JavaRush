package com.NaumDeveloper.JavaRush;// 2.7 Метод , if Минимум трёх чисел


/*

Минимум трёх чисел

*/

class Solution {

        // метод с параметрами
		
    public static int min(int a, int b, int c) {

        if (a <= b && a <= c)
            return a;
        else if (b <= a && b <= c)
            return b;
        else if (c <= a && c <= b);
            return c;




    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}