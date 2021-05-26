package com.NaumDeveloper.JavaRush;// 3.21   оператор сравнения If

/*

Написать метод compare(int a), чтобы он:
- выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
- выводил строку "Число больше 5", если параметр метода больше 5,
- выводил строку "Число равно 5", если параметр метода равен 5.

 */

public class Main {

    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
        compare(1);
        compare(0);
        compare(7);
    }

    public static void compare(int a) {


        if (a < 5)
            System.out.println( a +" Число меньше 5");

        if (a > 5)
            System.out.println( a +" Число больше 5");

        if(a == 5)
            System.out.println( a +" Число равно 5");


    }
    }



