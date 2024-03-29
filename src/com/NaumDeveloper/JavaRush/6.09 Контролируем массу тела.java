package com.NaumDeveloper.JavaRush;// 6.09 Контролируем массу тела

/*
Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
"Нормальный: между 18.5 и 24.9" - если индекс массы тела между 18.5 и 24.9,
"Избыточный вес: между 25 и 29.9" - если индекс массы тела между 25 и 29.9,
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 24.9

Требования:
•	Метод calculateMassIndex должен выводить текст на экран.
•	Метод calculateMassIndex должен выводить "Недовес: меньше чем 18.5" на экран, если индекс массы тела меньше 18.5.
•	Метод calculateMassIndex должен выводить "Нормальный: между 18.5 и 24.9" на экран, если индекс массы тела между 18.5 и 24.9.
•	Метод calculateMassIndex должен выводить "Избыточный вес: между 25 и 29.9" на экран, если индекс массы тела между 25 и 29.9.
•	Метод calculateMassIndex должен выводить "Ожирение: 30 или больше" на экран, если индекс массы тела 30 или больше.
*/


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());



        Body.calculateMassIndex(weight, height);

    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            height = (height*height);

            double index = weight/height;
            if(index < 18.5){
                System.out.println("Недовес: меньше чем 18.5");
            } else if(index >= 18.5 && index <= 24.9){
                System.out.println("Нормальный: между 18.5 и 24.9");
            } else if(index >= 25.0 && index <=29.99){
                System.out.println("Избыточный вес: между 25 и 29.9");
            } else if(index >= 30.0){
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}




