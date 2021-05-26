package com.NaumDeveloper.JavaRush;// 3.02 Конструкторы

/*

Конструктор — это, по сути, шаблон для объектов класса.

 */


public class Main {

    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", 5); // создан объект с параметрами


        System.out.println(barsik.name);

    }
}



/*
"this" по-английски — "этот, этого". То есть это слово указывает на конкретный предмет.
"name для этого кота (которого мы создаем) = аргументу name, который указан в конструкторе.
age для этого кота (которого мы создаем) = аргументу age, который указан в конструкторе."

 */


public class Cat {
    String name;
    int age;

    static  int count=0;

    //создаём конструктор с параметрами

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }


}
