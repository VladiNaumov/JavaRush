// создаём массив каторый хочет пользователь


package com.NaumDeveloper.JavaRush;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int []a;
	    int n;
	    Scanner in = new Scanner(System.in); // комманда для ввода с клавиатуры
	    System.out.println("Enter numbers of array; "); //какой длины создать массив

	    n=in.nextInt();
	    a= new int [n];


	    for (int i=0; i<n; i++){
	        System.out.printf(" Enter a[" + i + "]=");
	        a[i]=in.nextInt();
        }


    }
}
