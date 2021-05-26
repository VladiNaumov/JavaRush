package com.NaumDeveloper.JavaRush;8.2 Демонстрация  использования  операций "<<" сдвинуть  влево и сдвинуть  вправо ">>"

public class Main {

    public static void main(String[] args) {

            int val = 1;

            for(int i = 0;  i  <  8; i++) {
                for (int t = 128; t > 0; t = t / 2) {
                    if ((val & t) != 0)
                        System.out.print("l  ");

                    else System.out.print("O  ");


                }


                System.out.println();

                val = val << 1;  //  сдвинуть  влево
            }

        val = 128;

        for(int i = 0;  i  <  8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0)
                    System.out.print("l  ");

                else System.out.print("O  ");


            }


            System.out.println();

            val  =  val  >>  1;  //  сдвинуть  вправо


        }


    }


}
