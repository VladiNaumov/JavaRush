package com.NaumDeveloper.JavaRush;// 5.26 Вывести на экран сегодняшнюю дату


/*
Вывести на экран текущую дату в аналогичном виде "21 02 2014".

Требования:
•	Дата должна содержать день, месяц и год, разделенные пробелом.
•	День должен соответствовать текущему.
•	Месяц должен соответствовать текущему.
•	Год должен соответствовать текущему.
•	Вся дата должна быть выведена в одной строке.
 */


import java.util.Date;
import java.text.SimpleDateFormat;


public class Main {


    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.print("" + dateFormat.format((new Date())) + "");

    }
}












