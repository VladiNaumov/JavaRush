package com.NaumDeveloper.JavaRush;// 2.3  создание объекта и присвоение


/*

Создай объект типа Cat (кот), объект типа Dog (собака),
объект типа Fish (рыбка) и объект типа Woman.
Присвой каждому животному владельца (owner).
*/

class Solution {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();

        cat.owner=woman;
        dog.owner=woman;
        fish.owner=woman;


    }

    public static class Cat {
        public Woman owner;

    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}








