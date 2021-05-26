package com.NaumDeveloper.JavaRush;// 5.5 создание объекта определённого типа с использованием конструктора без параметров


/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.

Требования:
Программа не должна считывать данные с клавиатуры.
Нужно создать три объекта типа Cat.
Нужно провести три боя.
Программа должна вывести результат каждого боя с новой строки.
*/



public class Main {


    public static void main(String[] args) {

// создание объекта cat1 типа Cat с использованием конструктора без параметров
        Cat mashka = new Cat("Mashka ", 1, 2, 3);
        Cat dranka = new Cat("Dranka", 2, 2, 3);
        Cat lenka = new Cat("Lenka", 3, 3, 6);


        // проводим бой

        System.out.println(mashka.fight(dranka));
        System.out.println(dranka.fight(lenka));
        System.out.println(mashka.fight(lenka));
    }

}

***************************************
public class Cat {

    protected String name;
    protected int age;
    protected int weight;
    protected int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
        int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
        int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

        int score = ageAdvantage + weightAdvantage + strengthAdvantage;
        return score > 2; // return score > 2 ? true : false;

    }
}



