package com.NaumDeveloper.JavaRush;// 5.9 Создать класс Cat c тремя методами initialize

/*
Задачи по инициализации объектов

Создать класс Cat с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

Примечание:
Имя(String), возраст(int), пол(char).

*/





public class Main {


    public static void main(String[] args) throws Exception {


    }
}



*******************************************************
public class Cat {


    private  String name;
    private  int age;
    private  char sex;

//метод initialize

    public void initialize(String name) {
        this.name = name;
    }

//метод initialize
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
//метод initialize

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}




