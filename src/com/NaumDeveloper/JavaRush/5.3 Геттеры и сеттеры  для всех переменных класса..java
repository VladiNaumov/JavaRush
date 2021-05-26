package com.NaumDeveloper.JavaRush;// 5.3 Геттеры и сеттеры  для всех переменных класса.

/*

Создать class Dog.
У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.


 */

class Dog {


    public String name;
    int age;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class Main {

    public static void main(String[] args) {


    }
}
