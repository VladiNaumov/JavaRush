package com.NaumDeveloper.JavaRush;// 2.1  создание объекта


/*

Создать 3 объекта типа Dog (собака).
Сохрани каждый экземпляр в отдельную переменную.
Присвоить им имена "Max", "Bella", "Jack".

*/

class Solution {
    public static void main(String[] args) {

        Dog max = new Dog();
        max.name = "Max";

        Dog bella = new Dog();
        bella.name = "Bella";

        Dog jack = new Dog();
        jack.name = "Jack";

    }
        public static class Dog {
            public String name;

        }

    }











