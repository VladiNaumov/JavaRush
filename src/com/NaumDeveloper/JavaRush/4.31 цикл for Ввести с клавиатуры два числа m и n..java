package com.NaumDeveloper.JavaRush;// 4.31 цикл for Ввести с клавиатуры два числа m и n.

/*
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

*/


import java.io.*;


    public class Main {

        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String mNum = reader.readLine();
            String nNum = reader.readLine();

            int n = Integer.parseInt(mNum);

            int m = Integer.parseInt(nNum);



            for (int i = 0; i < m; i++) {


                for (int j = 0; j < n; j++) {
                    System.out.print(8);


                }
                System.out.println();

            }

        }
    }