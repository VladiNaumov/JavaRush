package com.NaumDeveloper.JavaRush;

//  9.  Демонстрация  while число "fibanachi"
public class Main {

    public static void main(String[] args) {

            int count = 20;
            int a=1,b=1;
            System.out.print("0 "+ a + "  " + b + " ");
            int fibanachi =0, i=3;
            while (i<count){
                fibanachi=a+b;
                a=b;
                b=fibanachi;
                System.out.print(fibanachi + " ");
                i++;
            }

    }


}
