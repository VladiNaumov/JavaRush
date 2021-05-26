package com.NaumDeveloper.JavaRush;// 2.4 Метод , параметры и возвращение значения (return )


/*

информацией нужно пользоваться часто, и, чтобы не считать каждый раз,
реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле,
и возвращает, сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения - double.

*/

class Solution {


    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }



    public static double getWeight(int earthWeight) {
        double moonWeight = earthWeight * 0.17;
        return moonWeight;
    }
}