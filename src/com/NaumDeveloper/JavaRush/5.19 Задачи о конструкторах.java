package com.NaumDeveloper.JavaRush;// 5.1 Задачи о конструкторах

/*
Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
Подумай, какой конструктор нужно вызвать.
Подсказка:
внимательно изучи реализацию конструктора по умолчанию.

Требования:
•	У класса должно быть 3 конструктора.
•	Конструктор с двумя параметрами должен инициализировать переменные x и y переданными значениями.
•	Конструктор с двумя параметрами должен инициализировать переменную radius значением 10.
•	Конструктор с двумя параметрами должен вызывать другой конструктор, передав в него верные значения параметров.
•	Метод main не изменять.
•	Конструктор по умолчанию не изменять.
 */




public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}


***********************************



public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //напишите тут ваш код

        this(x, y, 10);  //- это и есть вызов другого конструктора
    }


    public Circle() {
        this(5, 5, 1);
    }



}