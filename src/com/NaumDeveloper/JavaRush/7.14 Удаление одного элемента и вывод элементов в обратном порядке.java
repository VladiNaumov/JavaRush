package com.NaumDeveloper.JavaRush;// 7.14 Удаление одного элемента и вывод элементов в обратном порядке

/*
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

Требования:
Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
Считай 5 строк с клавиатуры и добавь их в список.
Удали третий элемент списка.
Выведи элементы на экран, каждый с новой строки.
Порядок вывода должен быть обратный.

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> mun_list = new ArrayList();
        for (int i = 0; i < 5; i++) {  // ввод данных с клавиатуры и добавление строк в начало списка.
            mun_list.add(reader.readLine());

        }
        mun_list.remove(2); // удоления элемента под номером 3

        Collections.sort(mun_list, Collections.reverseOrder());
        Iterator ir=mun_list.iterator();

        while (ir.hasNext()){
            System.out.println(ir.next());
        }


    }


}


