package com.NaumDeveloper.JavaRush;//5.2 Реализовать метод boolean fight(Cat anotherCat):

/*

Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е.
возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false

Требования:
Класс Cat должен содержать конструктор без параметров.
Класс Cat должен содержать всего три поля: age, weight и strength.
Поля должны быть публичные.
В классе Cat должен быть метод fight.
В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.


 */





public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 5;
        cat2.age = 5;

        cat1.weight = 8;
        cat2.weight = 7;

        cat1.strength = 3;
        cat2.strength = 2;


        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}

************************************************************************

public class Cat {

    public int age;      // возраст
    public int weight;   // вес
    public int strength; // сила

    public Cat() {
        // конструктор по умолчанию
    }

/*

В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.

 */

    public boolean fight(Cat anotherCat) {

        if (this.weight > anotherCat.weight)
            return true;


        if (this.age > anotherCat.age)
            return true;


        if (this.strength > anotherCat.strength)
            return true;


            return false;
    }
}
