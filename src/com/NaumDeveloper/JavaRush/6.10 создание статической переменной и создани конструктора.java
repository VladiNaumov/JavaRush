package com.NaumDeveloper.JavaRush;// 6.10 создание статической переменной и создани конструктора

/*

В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.

Требования:
•	В классе Cat создай статическую переменную public int catCount.
•	В классе Cat создай конструктор public Cat() без параметров.
•	Конструктор должен увеличивать значение статической переменной catCount на 1.
•	В методе main создай 10 котов.
•	В методе main, после создания всех котов, выведи значение переменной catCount.

*/




public class Main {

    public static void main(String[] args) { //создай 10 котов

        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
        }
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;

        public Cat() {
            catCount++;
        }
    }

}
