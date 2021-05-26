package com.NaumDeveloper.JavaRush;// Добавление  параметризированного  метода

public class main {


    public static void main(String[] args) {


        Auto minivan = new Auto();  //cоздать  объект  minivan типа  Auto
        Auto sportscar = new Auto();

        double gallons;
        int dist=252;

        //  Присвоить  значения  полям в  объекте  minivan

        minivan.matkustaja = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //  Присвоить  значения полям  в  объекте  sportscar

        sportscar.matkustaja = 2;
        sportscar.fuelcap = 16;
        sportscar.mpg = 12;

        //  Рассчитать  дальность  поездки  при  полном  баке (используется параметр )

        gallons = minivan.fuelneeded(dist);



        // вывести расчеты на экран

        System.out.println("Для преодоления " + dist + "  миль мини-фургону требуется " + gallons + " галлонов  топлива");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist + "  миль спортивному  автомобилю  требуется " + gallons + " галлонов  топлива");


    }

}


//***Class Autoa***

/*
Добавление  параметризированного  метода,  в  котором  производится
расчет  объема  топлива,  необходимого  транспортному  средству  для
преодоления  заданного  расстояния.
*/

class Auto {

    //  Делаем описание типа данных

    int matkustaja; // количество  пассажи ров
    int fuelcap;    // емкость  топливного бака
    int mpg;       //  потребление  топлива в милях на галлон


    // Определить дальность поездки транспортного средства спомощь использования методов (функций)
         // использования методов (функций)
    int range()
    {
        return mpg * fuelcap;

    }



//  Рассчитать  объем  топлива,  необходимого  транспортному средству  для  преодоления  заданного  расстояния
// использования параметра

    double fuelneeded(int miles)
    {
        return (double) miles / mpg;
    }

}
