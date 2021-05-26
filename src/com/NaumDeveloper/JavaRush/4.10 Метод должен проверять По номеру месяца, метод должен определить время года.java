package com.NaumDeveloper.JavaRush;// 3.24 Метод должен проверять По номеру месяца, метод должен определить время года

/*

Напишите метод checkInterval.
По номеру месяца, метод должен определить время года (зима, весна, лето, осень)
и вывести на экран.

 */

public class Main {

    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        {
            if (month>0)
                if (month<3)
                    System.out.println("зима");
        }
        {
            if (month>2)
                if (month<=5)
                    System.out.println("весна");
        }
        {
            if (month>5)
                if (month<=8)
                    System.out.println("лето");
        }
        {
            if (month>8)
                if (month<=11)
                    System.out.println("осень");
        }
        if (month== 12)

                System.out.println("зима");



    }
}
