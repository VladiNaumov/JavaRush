package com.NaumDeveloper.JavaRush;// 5.11 Создать класс Dog (собака) с тремя инициализаторами:



//- Имя
//- Имя, рост
//- Имя, рост, цвет

/*
Задачи по инициализации объектов

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная height с типом int.
•	У класса Dog должна быть переменная color с типом String.
•	У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, рост и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров имя, рост, цвет и инициализирующий соответствующие переменные класса.

*/





public class Main {


    public static void main(String[] args) throws Exception {


    }
}



************************************************
ublic class Dog {

        public String name;
        public String color;
        public int age;
        public int height;


        public void initialize(String name) {
            this.name = name;


        }

        public void initialize(String name, int height) {
            this.name = name;
            this.height = height;

        }

        public void initialize(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }
    }


