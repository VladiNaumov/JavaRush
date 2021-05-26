package com.NaumDeveloper.JavaRush;// 4.29 Ввести с клавиатуры четыре числа, и вывести максимальное из них.

/*

Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

 */

import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double n1 = Double.parseDouble(reader.readLine());
        double n2 = Double.parseDouble(reader.readLine());
        double n3 = Double.parseDouble(reader.readLine());
        double n4 = Double.parseDouble(reader.readLine());

        if (n1 >= n4){
            if (n1 >= n3){
                if (n1 >= n2)
                    System.out.println(n1);
                else System.out.println(n2);
            }else {
                if(n3 >= n2)
                    System.out.println(n3);
                else System.out.println(n2);
            }

        }else {
            if (n4 >= n3) {
                if (n4 >= n2)
                    System.out.println(n4);
                else System.out.println(n2);
            }else {
                if(n3 >= n2)
                    System.out.println(n3);
                else System.out.println(n2);
            }
        }
    }
}




