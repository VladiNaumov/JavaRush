package com.NaumDeveloper.JavaRush;//  В  этой  программе  создаются  два  объекта  класса  Auto
//  добавление  метода  range() использоващие  возвращаемое значения в  класс Auto



public class main {


    public static void main(String[] args) {


        Auto minivan = new Auto();  //cоздать  объект  minivan типа  Auto
        Auto sportscar = new Auto();

        int range1, range2;

        //  Присвоить  значения  полям в  объекте  minivan

        minivan.matkustaja = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //  Присвоить  значения полям  в  объекте  sportscar

        sportscar.matkustaja = 2;
        sportscar.fuelcap = 16;
        sportscar.mpg = 12;

        //  Рассчитать  дальность  поездки  при  полном  баке (используется метод)

        range1 = minivan.range();
        range2 = sportscar.range();

        // вывести расчеты на экран

        System.out.println("Mини-фypгoн может перевезти " + minivan.matkustaja + " на расстояние " + range1 + " миль");


        System.out.println("Cпopтивный автомобиль может перевезти " + sportscar.matkustaja + " на расстояние " + range2 + " миль");


    }

}



// Class

class Auto {

    //  Делаем описание типа данных

    int matkustaja; // количество  пассажи ров
    int fuelcap;    // емкость  топливного  бака
    int mpg;       //  потребление  топлива  в  милях  на  галлон

    //Отобразить дальность поездки транспортного средства спомощью использования методов (функций)

    int range() {

        return mpg * fuelcap;

    }


}

