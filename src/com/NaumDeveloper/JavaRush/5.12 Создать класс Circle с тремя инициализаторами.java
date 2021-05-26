package com.NaumDeveloper.JavaRush;// 5.12 Создать класс Circle с тремя инициализаторами:

/*
Задачи по инициализации объектов

Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Circle должны быть переменные centerX, centerY, radius, width и color с типом int.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius, width и инициализирующий соответствующие переменные класса.
•	У класса должен быть метод initialize, принимающий в качестве параметров centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса.
*/





    public class Main {


        public static void main(String[] args) {


        }
    }




**********************************

public class Circle {

         int centerX;
         int centerY;
         int radius;
         int width;
         int color;

        public void initialize(int centerX, int centerY, int radius){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public void initialize(int centerX, int centerY, int radius, int width){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = width;
            this.width = radius;
        }

        public void initialize(int centerX, int centerY, int radius, int width, int color){
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
            this.width = width;
            this.color = color;
        }

}


