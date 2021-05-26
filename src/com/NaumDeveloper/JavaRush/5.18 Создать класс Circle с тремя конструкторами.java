package com.NaumDeveloper.JavaRush;// 5.18 Создать класс Circle с тремя конструкторами

/*
Задачи о конструкторах

Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color

Требования:
•	У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
•	У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
•	У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
•	У класса должен быть конструктор, принимающий в качестве параметров centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.

*/


class Circle{
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;


    public Circle (int centerX, int centerY, int radius ){
    this.centerX=centerX;
    this.centerY=centerY;
    this.radius=radius;

    }

    public Circle(int centerX, int centerY, int radius, int width){
    this.centerX=centerX;
    this.centerY=centerY;
    this.radius=radius;
    this.width=width;

    }

    public Circle(int centerX, int centerY, int radius, int width, int color ){
    this.centerX=centerX;
    this.centerY=centerY;
    this.radius=radius;
    this.width=width;
    this.color=color;



    }
}


    public class Main {


        public static void main(String[] args) {

        }
    }