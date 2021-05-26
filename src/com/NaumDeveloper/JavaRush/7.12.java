package com.NaumDeveloper.JavaRush;// 7.12

/*
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
•	Должна быть выведена только одна строка.
*/


import java.io.BufferedReader;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();


         int as = 0; int ad=0;


        for(int i = 0; i < 10; i++){ strings.add(scanner.nextLine());  // ввод с клавиатуры

        }
        String max=strings.get(0);
        for (int i=1; i<strings.size(); i++){
            if (max.length()<strings.get(i).length()) max = strings.get(i);
            as=i;
        }

        String min=strings.get(0);
        for (int i=1; i<strings.size(); i++){
            if (min.length()>strings.get(i).length()) min = strings.get(i);
            ad=i;
        }

        if(as<ad) System.out.println(max);
        else System.out.println(min);

    }
}



