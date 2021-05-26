package com.NaumDeveloper.JavaRush;// 7.17 Удваиваем слова

/*
1. Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

3. Выведи результат на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
•	Выведи получившийся список на экран, каждый элемент с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();  // создаем список

        for (int i = 0; i < 10; i++) {
           list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list); // Вывести на экран result

        for(String s : result)
            System.out.println(s);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, list.get(i));

        }
        return list;
    }
}

