package com.NaumDeveloper.JavaRush;// усовершенствовать класс Auto,  добавив в него конструктор

/*
мы можем усовершенствовать класс Auto,  добавив в него конструктор,
вкотором будут автоматически инициал изироваться поля passengers,
fuelcap и mpg припостроении объекта.

Обратите особое внимание на то,каким образом создаются объекты типа Auto.
*/


public class main {


    public static void main(String[] args) {

//  Полностью  сконструировать  объекты  транспортных  средств

        Auto minivan = new Auto(7,16,21);  //cоздать  объект  minivan типа  Auto
        Auto sportscar = new Auto(2,14,12);

        double gallons;
        int dist=252;

        // вывести расчеты на экран

        gallons = minivan.fuelneeded(dist);


        System.out.println("Для преодоления " + dist + "  миль мини-фургону требуется " + gallons + " галлонов  топлива");


        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + "  миль спортивному  автомобилю  требуется " + gallons + " галлонов  топлива");


    }

}



//CLAS Auto//


class Auto {

    //  Делаем описание типа данных

    int matkustaja; // количество  пассажи ров
    int fuelcap;    // емкость  топливного бака
    int mpg;       //  потребление  топлива в милях на галлон

    //  Это конструктор класса Vehicle
    Auto (int р, int f, int m) {
        matkustaja = р;
        fuelcap = f;
        mpg = m;
    }

        //  Определить  дальность  поездки  транспортного  средства

    int range() {
        return mpg * fuelcap;

    }



//  Рассчитать  объем  топлива,  необходимого  транспортному средству  для  преодоления  заданного  расстояния
// использования параметра

    double fuelneeded(int miles)
    {
        return (double) miles / mpg;
    }

}