package com.NaumDeveloper.JavaRush;// 5.7 Среднее арифметическое

/*
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8

б) при вводе чисел
4
3
2
1
-1
получим вывод
2.5

Подсказака: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}*/


import java.io.*;


public class Main {


    public static void main(String[] args) throws Exception {

        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        int count = 0;

        while (true) {
            int n = Integer.parseInt(reader.readLine());
            if (n == -1) {
                break;
            }
            sum = sum + n; //считаем сумму всех чисел
            count++; //увеличиваем кол-во вводимых чисел на 1
        }
        System.out.println(sum / count); //делим сумму чисел на кол-во вводимых чисел
    }
}







