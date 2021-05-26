package com.NaumDeveloper.JavaRush;// 7.13 Игра Jолушка 1.0: распихиваиние чисел по трем спискам.

/*
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

Требования:
Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
Считать 20 чисел с клавиатуры и добавить их в главный список.
Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
Добавить в третий дополнительный список все остальные числа из главного.
Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
Программа должна вывести три дополнительных списка, используя метод printList.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<Integer> mainList = new ArrayList<>();
            ArrayList<Integer> threeList = new ArrayList<>();
            ArrayList<Integer> twoList = new ArrayList<>();
            ArrayList<Integer> oneList = new ArrayList<>();


        for (int i = 0; i < 20; i++) {  // ввод данных с клавиатуры
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < 20; i++){
            if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 == 0){
                threeList.add(mainList.get(i));
                twoList.add(mainList.get(i));
            }
            else if (mainList.get(i) % 3 == 0){
                threeList.add(mainList.get(i));
            }
            else if (mainList.get(i) % 2 == 0){
                twoList.add(mainList.get(i));
            }
            else if (mainList.get(i) % 3 != 0 && mainList.get(i) % 2 != 0){
                oneList.add(mainList.get(i));
            }
        }

        printList(threeList);
        printList(twoList);
        printList(oneList);

    }



    public static void printList(List<Integer> list) {
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}







