package com.NaumDeveloper.JavaRush;// 7.8 ArrayList сравнение строк, определение строк с длиной равной максимальной

/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
Инициализируй существующее поле strings класса Solution новым ArrayList<>
Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
Программа должна выводить самую длинную строку на экран.
Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Main {

    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // ArrayList<String> strings = new ArrayList(); // Потому что есть строка 27

                strings = new ArrayList();

        for (int i = 0; i < 5; i++) {  // ввод данных с клавиатуры
            strings.add(reader.readLine());
        }


        int max = 0;

        for (int i = 0; i < strings.size();i++){
            if (strings.get(i).length() > max) max = strings.get(i).length();
        }

        for (int i = 0; i < strings.size();i++){
            if (strings.get(i).length() == max) System.out.println(strings.get(i));
        }
    }
}



