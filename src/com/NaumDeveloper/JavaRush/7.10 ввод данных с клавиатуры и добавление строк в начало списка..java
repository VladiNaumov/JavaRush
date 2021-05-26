package com.NaumDeveloper.JavaRush;// 7.10 ввод данных с клавиатуры и добавление строк в начало списка.

/*
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна добавлять строки в начало списка.
•	Программа должна выводить список на экран, каждое значение с новой строки.


*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws Exception {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> mun_list = new ArrayList();


        for (int i = 0; i < 10; i++) {  // ввод данных с клавиатуры и добавление строк в начало списка.
            mun_list.add(0,reader.readLine());

        }



        for(int i = 0; i <mun_list.size(); i++){ // чтение данных со списка
            System.out.println(mun_list.get(i));
        }

    }
}



