package com.NaumDeveloper.JavaRush;// 5.4 создание объекта определённого типа с использованием конструктора без параметров


/*
Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.

        Требования:
        Программа не должна считывать данные с клавиатуры.
        Нужно создать три объекта типа Cat.
        Класс Cat нельзя изменять.
        Программа не должна выводить данные на экран.
*/

public class Main {


    public static void main(String[] args) {

// создание объекта cat1 типа Cat с использованием конструктора без параметров
        Cat cat1 = new Cat("sdf", 1, 2, 3);
        Cat cat2 = new Cat("dre", 2, 2, 3);
        Cat cat3 = new Cat("dfd", 3, 3, 6);
    }
}

**********************************************
public class Cat { // объявление класса Cat
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) { // конструктор с четырьмя(!!!) параметрами, конструктора без параметров НЕТ
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    } 


