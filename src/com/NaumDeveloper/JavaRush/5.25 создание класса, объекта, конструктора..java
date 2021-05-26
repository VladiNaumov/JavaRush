package com.NaumDeveloper.JavaRush;// 5.25 создание класса, объекта, конструктора.


/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
 */

public class Main {


    public static void main(String[] args) {

        Dog dog=new Dog("Dog", 15, 25 );
        Mouse mause=new Mouse("Maus", 3, 12);
        Cat cat=new Cat("Vat", 1, 35);


    }

    public static class Dog {
        String name;
        int age;
        int pv;

        public Dog(String name, int age, int pv) {
            this.name = name;
            this.age = age;
            this.pv = pv;
        }
    }

    public static class Cat {
        String name;
        int age;
        int pv;

        public Cat(String name, int age, int pv) {
            this.name = name;
            this.age = age;
            this.pv = pv;

                }
            }

    public static class Mouse {
        String name;
        int age;
        int pv;

        public Mouse(String name, int age, int pv) {
            this.name = name;
            this.age = age;
            this.pv = pv;

        }
    }
 }













