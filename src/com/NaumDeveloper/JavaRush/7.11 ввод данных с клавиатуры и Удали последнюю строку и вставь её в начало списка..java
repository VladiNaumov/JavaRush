package com.NaumDeveloper.JavaRush;// 7.10 ввод данных с клавиатуры и Удали последнюю строку и вставь её в начало списка.

/*
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры.
•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
•	Программа должна выводить список на экран, каждое значение с новой строки.

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> mun_list = new ArrayList();


            for (int i = 0; i < 5; i++) {  // ввод данных с клавиатуры и добавление строк в начало списка.
                mun_list.add(reader.readLine());

            }


            for (int j = 0; j < 13; j++) {
                mun_list.add(0, mun_list.remove(mun_list.size() - 1));
            }


            for (int i = 0; i < 5; i++) { // чтение данных со списка
                System.out.println(mun_list.get(i));
            }

        }
    }


