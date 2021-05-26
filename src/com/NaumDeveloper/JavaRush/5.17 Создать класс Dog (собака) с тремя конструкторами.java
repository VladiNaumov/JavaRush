package com.NaumDeveloper.JavaRush;// 5.17 Создать класс Dog (собака) с тремя конструкторами

/*
Задачи о конструкторах

Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет

*/


class Dog{
    String name;
    String color;
    int height;


    public Dog (String name ){
    this.name=name;

    }

    public Dog(String name, int height){
    this.name=name;
    this.height=height;

    }

    public Dog(String name, int height, String color){
    this.name=name;
    this.height=height;
    this.color=color;



    }
}


    public class Main {


        public static void main(String[] args) {

        }
    }