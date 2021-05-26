package com.NaumDeveloper.JavaRush;// 4.21 Ввести с клавиатуры имя и используя цикл for 10 раз вывести

/*

Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.

 */

import java.io.*;

public class Main {




    public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String b = reader.readLine(); // ввод строки
            for (int a = 0; a < 10; a++ ){
                System.out.println( b + " любит меня.");
            }

        }
    }