package com.NaumDeveloper.JavaRush;// 5.23 создание класса, объекта, метод toString.
//  Выведи все созданные объекты на экран


/*


В этой программе уже реализован класс «утка», и даже созданы две конкретных утки (два объекта).
По аналогии с классом утка, создайте еще парочку категорий животных, а именно — Cat (кошка) и Dog (собака).
Выясните, что должен возвращать метод toString в этих классах и создайте каждой твари по паре (в смысле объектов) и выведите их на экран.

Требования:
•	Создай класс Cat(кошка).
•	Создай класс Dog(собака).
•	У класса Cat должен быть верно реализован метод toString.
•	У класса Dog должен быть верно реализован метод toString.
•	В методе main создай два объекта типа Cat.
•	В методе main создай два объекта типа Dog.
•	Выведи все созданные объекты на экран.

 */

public class Main {


    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);

			// создание метода
    }
    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Cat{
        public String toString() {
            return "Cat";
        }

    }
    public static class Dog{
        public String toString() {
            return "Dog";
        }


    }

}
