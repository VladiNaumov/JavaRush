package com.NaumDeveloper.JavaRush;
/*
Задачи о конструкторах

Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)

Требования:
У класса Rectangle должны быть переменные top, left, width и height с типом int.
У класса должен быть хотя бы один конструктор.
У класса должно быть хотя бы два конструктора.
У класса должно быть хотя бы три конструктора.
У класса должно быть хотя бы четыре конструктора.

*/



 class Rectangle {

    int left;
    int top;
    int width;
    int height;



     public Rectangle(int left) {
         this.left = left;
         this.top = top;
         width = 0;
         height = 0;

     }

     public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        width = 0;
        height = 0;
    }
    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }

     public Rectangle(int left, int top, int width, int height) {
         this.left = left;
         this.top = top;
         this.width = width;
         this.height = height;
     }

    public static void main(String[] args) {

    }
}







public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
