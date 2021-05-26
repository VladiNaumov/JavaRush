package com.NaumDeveloper.JavaRush;/*
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
         int a = Thread.currentThread().getStackTrace().length;
         System.out.println(a);
         return a;
    }
}

/* 
Логирование стек-трейса

Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09.task0906.Solution: main: In main method
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
      StackTraceElement[] sTE = Thread.currentThread().getStackTrace();
      System.out.println(sTE[2].getClassName() + ": " + sTE[2].getMethodName() + ": " + s);
    }
}


import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap map = new HashMap(null);
map.put(null, null);
map.remove(null);

*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      try {
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
      }
        catch (NullPointerException s){
        String t=s.getMessage();
            System.out.println(s);
        }
    }
}


