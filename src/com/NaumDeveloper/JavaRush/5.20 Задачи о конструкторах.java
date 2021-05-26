package com.NaumDeveloper.JavaRush;// 5.2 Максимум конструкторов

/*
Изучи класс Circle. Напиши максимальное количество конструкторов с разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.

Требования:
У класса должно быть хотя бы три переменные.
У класса должен быть конструктор по умолчанию.
У класса должен быть хотя бы один конструктор.
У класса должно быть хотя бы два конструктора.
У класса должно быть хотя бы три конструктора.
У класса должно быть хотя бы четыре конструктора.
 */




public class Main {

    public static void main(String[] args) {

    }
}


******************************************

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle() {

    }

    public Circle(double x) {
        this.x = x;
    }

    public Circle(double x, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.x = x;
        this.radius = radius;

    }
}
