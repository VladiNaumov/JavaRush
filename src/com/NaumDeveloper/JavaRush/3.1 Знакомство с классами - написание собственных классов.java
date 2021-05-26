package com.NaumDeveloper.JavaRush;// 3.0 Знакомство с классами: написание собственных классов

/*
Класс — это, по сути, шаблон для объекта.
Он определяет, как объект будет выглядеть и какими функциями обладать.
Каждый объект является объектом какого-то класса.
 */

class Cat {
    String name;
    int age;
    static int count = 0;

    public static void main(String[] args) {
		
        Cat barsik = new Cat(); // создание объекта 
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;

        Cat vasia = new Cat();
        vasia.age = 5;
        vasia.name = "Вася";
        count++;

        Cat linki = new Cat();
        linki.age = 12;
        linki.name = "Gest";
        count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);
        System.out.println("Мы создали кота по имени " + linki.name + ", его возраст - " + linki.age);

        System.out.println("Общее количество котов = " + count);
    }
}