package com.NaumDeveloper.JavaRush;// 3.25 Ввести с клавиатуры Если число число положительное Если число отрицательное

/*

Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

 */

import java.io.*;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt( reader.readLine()); // для хранения целых чисел

        if (a == 0) { System.out.println(a); }
        if (a > 0) { a = a + a;  System.out.println(a);    }
        if (a < 0) { a = a + 1;  System.out.println(a);    }
    }


}