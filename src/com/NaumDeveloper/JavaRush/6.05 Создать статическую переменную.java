package com.NaumDeveloper.JavaRush;// 6.05 Создать статическую переменную

/*
Задачи на статические методы

Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).

Требования:
•	Добавь в класс метод getCatCount.
•	Метод getCatCount должен возвращать int.
•	Метод getCatCount должен возвращать значение переменной catCount.
•	Добавь в класс метод setCatCount, принимающий int.
•	Метод setCatCount ничего не должен возвращать.
•	Метод setCatCount должен присваивать переменной catCount переданное значение.
*/




public class Main {

    private static int catCount = 0;

    public Main() {
        catCount++;
    }

    public static int getCatCount() {

        return catCount;

    }

    public static void setCatCount(int g) {

        catCount = g;

    }

    public static void main(String[] args) {

    }
}

