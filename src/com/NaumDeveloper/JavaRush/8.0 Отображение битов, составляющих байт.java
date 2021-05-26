package com.NaumDeveloper.JavaRush;// 8.0 Отображение битов, составляющих байт

public class Main {

    public static void main(String[] args) {

            int t;
            byte val;
            val = 127;

            for(t = 128;  t  >  0; t = t/2) {
                if ((val & t) != 0)
                    System.out.print("l  ");
                else System.out.print("O  ");


            }



       
    }


}
