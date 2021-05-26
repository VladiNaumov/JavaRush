package com.NaumDeveloper.JavaRush;//  8.1 Демонстрация  поразрядной  операции  НЕ (!=)

public class Main {

    public static void main(String[] args) {

byte b=-34;

        for(t = 128;  t  >  0; t = t/2) {
            if ((b & t) != 0)
                System.out.print("l  ");
            else System.out.print("O  ");


        }

        System.out.println();

    //  Обратить  состояние  всех  битов

        b=(byte)~b;
        for(t = 128;  t  >  0; t = t/2) {
            if ((b & t) != 0)
                System.out.print("l  ");
            else System.out.print("O  ");
        }

        System.out.println ();
    }


}
