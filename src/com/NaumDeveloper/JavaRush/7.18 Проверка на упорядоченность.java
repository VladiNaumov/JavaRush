package com.NaumDeveloper.JavaRush;// 7.18 Проверка на упорядоченность

/*
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
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

        for (int i = 0; i < 9;){
            if (list.get(i).length() <= list.get(i + 1).length())
                i++;
            else {
                System.out.println(i + 1);
                break;}
        }

    }
}