package com.NaumDeveloper.JavaRush;// 7.9 ArrayList сравнение строк, определение строк с длиной равной минимальной

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
•	Программа должна выводить самую короткую строку на экран.
•	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;




public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList();

        int min=Integer.MAX_VALUE;



        for (int i = 0; i < 5; i++) {  // ввод данных с клавиатуры
            strings.add(reader.readLine());
        }

        // вычисляем короткую строку

        for (int i = 0; i < 5; i++){ // перебор по массиву
            if (strings.get(i).length() < min)
                min = strings.get(i).length();

        }

        for (int i = 0; i < 5; i++){ // перебор по массиву
            if (min == strings.get(i).length())
                System.out.println(strings.get(i));
        }
    }
}

