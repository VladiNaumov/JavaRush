package com.NaumDeveloper.JavaRush;// 5.16 Создать класс Cat (кот) с пятью конструкторами:

/*
Задачи о конструкторах

Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

Требования:
•	У класса Cat должна быть переменная name с типом String.
•	У класса Cat должна быть переменная age с типом int.
•	У класса Cat должна быть переменная weight с типом int.
•	У класса Cat должна быть переменная address с типом String.
•	У класса Cat должна быть переменная color с типом String.
•	У класса должен быть конструктор, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
•	У класса должен быть конструктор, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
*/





    public class Main {

        public static void main(String[] args) {


        }
    }



*********************************************************

/*
У класса Cat должна быть переменная name с типом String.
•	У класса Cat должна быть переменная age с типом int.
•	У класса Cat должна быть переменная weight с типом int.
•	У класса Cat должна быть переменная address с типом String.
•	У класса Cat должна быть переменная color с типом String.
 */


public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat (String name){
        this.name=name;
        this.age=3;
        this.weight=7;
        this.address=null;
        this.color="Blak";
    }

    public Cat (String name, int weight, int age ){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.address=null;
        this.color="valkoinen";
    }

    public Cat (String name, int age){
        this.name=name;
        this.age=age;
        this.weight=11;
        this.address=null;
        this.color="harma";
    }

    public Cat (int weight, String color){
        this.name=null;
        this.age=1;
        this.weight=weight;
        this.address=null;
        this.color=color;
    }

    public Cat (int weight, String color, String address){
        this.name=null;
        this.age=15;
        this.weight=weight;
        this.address=address;
        this.color=color;
    }

}


