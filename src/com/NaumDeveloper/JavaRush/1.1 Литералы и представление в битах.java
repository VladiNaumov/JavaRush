package com.NaumDeveloper.JavaRush;// 1.1 Литералы и представление в битах


public class Main {

    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1: "+ Integer.toBinaryString(i1));

        int i2 = 0x2f;
        System.out.println("i2: "+ Integer.toBinaryString(i2));

        int i3 = 0x2f;
        System.out.println("i3: "+ Integer.toBinaryString(i3));

        char c=0xffff;
        System.out.println("char c: "+ Integer.toBinaryString(c));

        byte b=0x7f;
        System.out.println("byte b: "+ Integer.toBinaryString(b));

        short s=0x7fff;
        System.out.println("short s: "+ Integer.toBinaryString(s));
        System.out.println();

        long n1=200L;
        System.out.println("long n1: "+ n1 );

        long n2=200l;
        System.out.println("long n2: "+ n2);

        long n3=200;
        System.out.println("long n3: "+ n3 );

        float f1=1;
        System.out.println("c: "+ f1);
        float f2=1F;
        System.out.println("c: "+ f2);
        float f3=1f;
        System.out.println("c: "+ f3);

        double d1=1D;
        System.out.println("c: "+ d1);
        double d2=1d;
        System.out.println("c: "+ d2);



    }
}