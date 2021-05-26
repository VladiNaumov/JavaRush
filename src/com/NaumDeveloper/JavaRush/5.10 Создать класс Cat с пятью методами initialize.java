package com.NaumDeveloper.JavaRush;// 5.10 Создать класс Cat с пятью методами initialize

/*
Задачи по инициализации объектов

Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.

*/





public class Main {


    public static void main(String[] args) throws Exception {


    }
}


**********************************************

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;
    public void initialize(String name){
        this.name = name;
        this.weight = 1;
        this.age = 1;
        this.color = "red";
    }
    public void initialize(String name,int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "red";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }
    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.address = address;
        this.color = color;
        this.age = 1;
    }
}




