package com.NaumDeveloper.JavaRush;
/* 
Ближайшее к 10

Напишите метод displayClosestToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используйте метод public static int abs(int a), который возвращает абсолютную величину числа.

Требования:
Программа должна выводить числа на экран.
Метод main не должен вызывать System.out.println() или System.out.print().
Метод main должен вызывать метод displayClosestToTen.
Метод displayClosestToTen должен вызывать метод abs.
Метод displayClosestToTen должен выводить число на экран согласно заданию.


*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        
      if (abs(10 - a) <= abs(10 - b)){
        System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}


 /* 
Напишите метод checkInterval. Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде: "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода.

Пример для числа 112:
Число 112 не содержится в интервале.

Пример для числа 60:
Число 60 содержится в интервале.

Требования:
Программа должна выводить текст на экран.
Метод main не должен вызывать System.out.println() или System.out.print().
Метод main должен вызывать метод checkInterval.
Метод checkInterval должен быть static void.
Метод checkInterval должен выводить текст на экран согласно заданию.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if(a < 50)
        System.out.println("Число " + a + " не содержится в интервале.");
        
        if(a > 100)
        System.out.println("Число " + a + " не содержится в интервале.");
        
        if(a > 50 && a < 100)
         System.out.println("Число " + a + " содержится в интервале.");
        
      

    }
}


/* 
Времена года на Терре

        12-2 зима
        4-6 весна
        7-9 лето
        10-11 осень


*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        
        if (month < 3 || month == 12) 
            System.out.println("зима");
       
        if (month >= 3 && month <= 5)
        System.out.println("весна");

         if (month >= 6 && month <= 8)
        System.out.println("лето");
        
         if (month >= 9 && month <= 11)
        System.out.println("осень");
        
       
    }
}


/* 
Положительное и отрицательное число

Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

Требования:
Программа должна считывать число c клавиатуры.
Программа должна выводить число на экран.
Если введенное число положительное, необходимо увеличить его в два раза и вывести.
Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.


*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
       Scanner sc = new Scanner(System.in);
      int numerot= Integer.parseInt(sc.nextLine());
       // int numerot = 0;
        
        if(numerot >= 1) {
           
            System.out.println(numerot * 2);
        }
        
       else if (numerot <= -1){
              
            System.out.println(++numerot);
        }

       else {
            System.out.println(0);
        }
    }
}


/* 
День недели

Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

Требования:
Программа должна считывать число c клавиатуры.
Программа должна выводить текст на экран.
Если введено число от 1 до 7, необходимо вывести день недели.
Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.


*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       
      Scanner sc = new Scanner(System.in);
      int day= Integer.parseInt(sc.nextLine());
      
    
      
      if(day == 1) System.out.println("понедельник");
      else if(day == 2) System.out.println("вторник");
      else if(day == 3) System.out.println("среда");
      else  if(day == 4) System.out.println("четверг");
      else if(day == 5) System.out.println("пятница");
      else if(day == 6) System.out.println("суббота");
      else if(day == 7) System.out.println("воскресенье");
      else System.out.println("такого дня недели не существует");

    }
}

/* 
Количество дней в году

Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
количество дней в году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.

Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.


*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);
         int g= Integer.parseInt(sc.nextLine());
        
        
        if (g %100==0 && g %400 ==0 )
            System.out.println("количество дней в году: 366");

        else if (g % 4 == 0 && g % 100 > 0)
            System.out.println("количество дней в году: 366");

        else if (g % 100 == 0)
            System.out.println("количество дней в году: 365");

        else
            System.out.println("количество дней в году: 365");
    }
}


/* 
Правило треугольника


Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других, то треугольника с такими сторонами не существует.

*/

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         int a= Integer.parseInt(sc.nextLine());
         int b= Integer.parseInt(sc.nextLine());
         int c= Integer.parseInt(sc.nextLine());
         
         
         if((a + b) > c  && (b + c) > a &&(c + a) > b)
         System.out.println("Треугольник существует.");
         else
         System.out.println("Треугольник не существует.");

    }
}

package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую

Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.

Пример для числа 2.5:
зелёный

Пример для числа 3:
жёлтый

Пример для числа 4:
красный

Пример для числа 5:
зелёный
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        
       Scanner sc = new Scanner(System.in);
       double time =  Double.parseDouble(sc.nextLine());
       
       
    
        
       if (time  % 5  < 3){
            System.out.println("зелёный");
            
        } else if (time  % 5 >= 3 && time % 5 < 4){
            System.out.println("жёлтый");
            
        } else System.out.println("красный");

    }
}

/* 
Существует ли пара?

Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a= Integer.parseInt(sc.nextLine());
        int b= Integer.parseInt(sc.nextLine());
        int c= Integer.parseInt(sc.nextLine());

         
         if(a == b && a == c && c == b)
         System.out.println(a + " " + b + " " + c + " ");
         
         else if(a == b)
         System.out.println(a + " " + b);
         
         else if(a == c)
          System.out.println(a + " " + c);
          
         else  if(b == c)
          System.out.println(b + " " + c);

    }
}

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        
         Solution solution = new Solution();
        System.out.println(solution.min(a, b));

    }
    
     public int min(int a, int b)
        {
            if (a < b)
                return a;
            else
                return b;
        }
}



/* 
Максимум четырех чисел
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = Integer.parseInt(sc.nextLine());
        
      System.out.println(myMin(a, b, c, d));

    }
    
    
    
    public static int myMin(int a, int b, int c, int d)
    {
        int abm = a > b ? a : b;
        int cdm = c > d ? c : d;
        int max = abm > cdm ? abm : cdm;
        
        return max;

    }
}

/* 
Сортировка трех чисел

Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
Программа должна считывать числа c клавиатуры.
Программа должна выводить числа на экран.
Программа должна выводить три числа разделенных пробелами.
Программа должна выводить числа в порядке убывания.

Проверить если на вход дать 0 0 15

*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());


        sortirovka(a,b,c);

    }
    
    public static void sortirovka(int a, int b, int c)
    {
        
      if (c >= b && b >= a)
            System.out.println(c + " " + b + " " + a);
        else
        if (b >= a && a >= c)
            System.out.println(b + " " + a + " " + c);
        else
        if (c >= a && a >= b)
            System.out.println(c + " " + a + " " + b);
        else
        if (b >= c && c >= a)
            System.out.println(b + " " + c + " " + a);
        else
        if (a >= b && b >= c)
            System.out.println(a + " " + b + " " + c);
        else
            System.out.println(a + " " + c + " " + b);

    }
}

/* 
Настя или Настя?

Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

Требования:
Программа должна считывать две строки c клавиатуры.
Программа должна содержать System.out.println() или System.out.print()
Если имена одинаковые вывести сообщение "Имена идентичны"
Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
Если имена и длины имен разные - ничего не выводить.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
         String a = sc.nextLine();
         String b = sc.nextLine();
         
        int len1 = a.length();                                                                                                                                                                                                                                                           
        int len2 = b.length();
        
        if (a.equals(b))    System.out.println("Имена идентичны");                                                                                                                                                                                                            
        else if (len1 == len2) System.out.println("Длины имен равны");                                                                                                                                                                                                        
        else {}   
         
    }
}


/* 
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

Требования:
Программа должна считывать строки c клавиатуры.
Программа должна использовать команду System.out.println() или System.out.print().
Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
Если возраст меньше либо равно 20 ничего не выводить.

*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       int age = Integer.parseInt(sc.nextLine());
         
        
         if(age >= 21) System.out.println("И 18-ти достаточно");
         else{}

    }
}


/* 
Три числа

Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

Требования:
Программа должна считывать числа c клавиатуры.
Программа должна использовать команды System.out.println() или System.out.print().
Программа должна выводить на экран порядковый номер числа, отличного от остальных.
Если все числа разные, ничего не выводить.

*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
      
       int a = Integer.parseInt(sc.nextLine());
       int b = Integer.parseInt(sc.nextLine());
       int c = Integer.parseInt(sc.nextLine());
       
     if(a != b && b != c && c != a){
         return;
     } 
     
      if (a != b && a != c)
            System.out.println("1");
        else if (b != a && b != c)
            System.out.println("2");
        else if (c != a && c != b)
            System.out.println("3");
            

    }
}

/* 
Ярлыки и числа

Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число

Требования:

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);
      
         int a = Integer.parseInt(sc.nextLine());
         
         
        if (a > 0 && (a % 2) == 0){                                                                                                                                                                                                                                                          
        System.out.println("положительное четное число");
        return;
        }
        if (a > 0 && (a % 1) == 0){                                                                                                                                                                                                                                                         
        System.out.println("положительное нечетное число");  
        return;
        }
        
        if (a < 0 && (a % 2)==0){                                                                                                                                                                                                                                                          
        System.out.println("отрицательное четное число");  
        return;
        }
        
        if (a < 0 && a % 1 == 0){                                                                                                                                                                                                                                                          
        System.out.println("отрицательное нечетное число"); 
        return;
            
        }
        
        if (a == 0)                                                                                                                                                                                                                                                          
        System.out.println("ноль");                            
        
    }
}

/* 
Описываем числа

Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число

*/

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
      
       int number = Integer.parseInt(sc.nextLine());
       
         
         
         if(number < 1 ) return;
         if(number >= 1000) return;
        
         if(number < 10 && (number % 2) == 0)
         System.out.println("четное однозначное число");
         
        else if(number < 10 && (number % 2) != 0)
         System.out.println("нечетное однозначное число");

        if(number >= 10 && number <= 99 && (number % 2) == 0)
         System.out.println("четное двузначное число");
         
         else if((number >= 10 && number <= 99 && (number % 2) != 0))
          System.out.println("нечетное двузначное число");

         if(number > 99 && number < 1000 && (number % 2) == 0)
          System.out.println("четное трехзначное число");
          
        else if((number > 100 && number < 1000 && (number % 2) != 0))
          System.out.println("нечетное трехзначное число");
         
    

    }
}

/* 
Положительное число

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
       Scanner sc = new Scanner(System.in);
       
       int summa = 0;
     
    
       int a = Integer.parseInt(sc.nextLine());
       int b = Integer.parseInt(sc.nextLine());
       int c = Integer.parseInt(sc.nextLine());
       
     
       
      // int a = 1;
       
       if(a > 0) ++summa; 
       if(b > 0) ++summa;
       if(c > 0) ++summa;
               
      
        System.out.println(summa);

    }
}


/* 
Положительные и отрицательные числа

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1

*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
       
       int summaPlus = 0;
       int summaMinus = 0;
     
    
       int a = Integer.parseInt(sc.nextLine());
       int b = Integer.parseInt(sc.nextLine());
       int c = Integer.parseInt(sc.nextLine());
       
     
       
     
       
       if(a > 0) ++summaPlus; 
       if(b > 0) ++summaPlus;
       if(c > 0) ++summaPlus;
       
        if(a < 0) ++summaMinus; 
        if(b < 0) ++summaMinus;
        if(c < 0) ++summaMinus;
       
           
           System.out.println("количество отрицательных чисел: " + summaMinus);
           System.out.println("количество положительных чисел: " + summaPlus);

    }
}


/* 
Гадание на долларовый счет

Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS

*/

public class Solution {
    public static void main(String[] args) {
        
         String s = "SSSSSSSSSS";
         int a = 10;
         int b = 0;
       
       while(b < a){
           
           
          System.out.println(s);
          ++b;
       }

    }
}

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.

Пример вывода на экран:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100
*/

public class Solution {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 1;

            while (a <= 10)
            {
                while (b <= 10)
                {
                    System.out.print(a * b + " ");
                    b++;
                }
                System.out.println();
                a++;
                b = 1;
            }
       }
    }

/* 
Хорошего много не бывает

Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
      
       String s = sc.nextLine();
       int number = Integer.parseInt(sc.nextLine());
       
       int summa = 0;
       
       while(summa < number){
           
           System.out.println(s);
           ++summa;
       }

    }
}

/* 
Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
       
       int m = Integer.parseInt(sc.nextLine());
       int n = Integer.parseInt(sc.nextLine());
      
       
       for (int i = 0; i < m; i++) {
            for (int a = 0; a < n; a++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}

/* 
Треугольник из восьмерок

Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/

public class Solution {
    public static void main(String[] args) {
        
       
        
         for (int i = 1; i <= 10; i++)
        {
            for (int k = 0; k < i; k++)
            
                System.out.print("8");
                System.out.println();
        }
            
    }   
}

/* 
Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).

*/

public class Solution {
    public static void main(String[] args) {
        for (int b = 1; b < 10; b++) {
            System.out.print("8");
        }
        for (int a = 0; a <= 10; a++) {
            System.out.println("8");
        }

    }
}


/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
     
          int a = Integer.parseInt(sc.nextLine());
          int b = Integer.parseInt(sc.nextLine());
          int c = Integer.parseInt(sc.nextLine());
          
          sortirovka(a,b,c);
          
    }
    
    public static void sortirovka(int a, int b, int c)
    {
        
    if ((a == b) && (a == c) && (b == c)) System.out.println(a);                                                   
    else if ((a == b) && (a != c) && (b != c)) System.out.println(a);                                                   
    else if ((a == c) && (a != b) && (c!=b)) System.out.println(a);                                                    
    else if ((b == c) && (b!=a) && (c!=a)) System.out.print(b);                                                  
  
    else if ((a>b) && (a<c) || (a<b) && (a>c)) System.out.println(a);                       
    else if ((b>a) && (b<c) || (b<a) && (b>c)) System.out.println(b);                                              
    else System.out.println(c) ;  

    }
}

/* 
Суммирование

Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}

*/

import java.util.Scanner;

public class Solution {
    
  
  
    public static void main(String[] args) throws Exception {
        
       Scanner sc = new Scanner(System.in);
       
       
        int a = 0;
        int sum = 1;

        while (a != -1) {

            a = Integer.parseInt(sc.nextLine());
            sum = sum + a;
        }

        System.out.println(sum + (-1));

    }
}

/* 
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.


*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int i = 0;
        if(this.weight>anotherCat.weight) {
            i++;
        } else if(this.weight<anotherCat.weight) {
            i--;
        }
        if(this.age>anotherCat.age) {
            i++;
        } else if (this.age<anotherCat.age) {
            i--;
        }
        if(this.strength>anotherCat.strength) {
              i++;
        } else if(this.strength<anotherCat.strength) {
            i--;
        }

        if(i>0) {return true;
        } else {return false;}
    }

    public static void main(String[] args) {

    }
}


/* 
Кошачья бойня

Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки


*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat("R", 2, 12,9);
        Cat cat2 = new Cat("M", 1, 11,7);
        Cat cat3 = new Cat("S", 3, 11,6);
        
        
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0 ? true : false;
        }
    }
}

/* 
Среднее арифметическое

Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8

б) при вводе чисел
4
3
2
1
-1
получим вывод
2.5

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}


*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
       
       
        double sum = 0;
        int count = 0;
        
        while (true) {

            int a = Integer.parseInt(sc.nextLine());
             if (a == -1) {
        System.out.println(sum/count);
        break;
    }
    sum += a;
    count++;
     
        
		}	
	}
}

/* 
Инициализация объектов

Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.

*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;


    public void initialize(String name, char sex, int money, int weight, int size) {
        this.name = name;
        this.sex = sex;
        this.money = money;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}

/* 
Вызов конструктора из конструктора

Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор с радиусом 10.
Подумай, какой конструктор нужно вызвать.
Подсказка:
внимательно изучи реализацию конструктора по умолчанию.

*/

public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
         this(x, y, 10);
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}

import java.util.Scanner;
import java.util.Arrays;

/* 
Совершенствуем функциональность

Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.

*/

public class Solution {

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int minimum = min(a, b, c, d, e);
        
        //return  min(a, min(min(b, c), min(d, f)));

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int x[] = new int[] {a,b,c,d,e};
        Arrays.sort(x);
        
        return x[0];
    }
}



/*Разберись, что делает программа.
Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.

Подсказка:
изучи конструктор по умолчанию.

*/


public class Circle {

    public Color color;

    public "void" Circle() {
        color = new Color();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

  
    public class Color {
        String description = "Red";

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

    }
}


/* 
Ставим котов на счётчик

В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.

Требования:
•	Добавь в класс Cat конструктор без параметров public Cat().
•	Конструктор класса должен на 1 увеличивать значение переменной catCount.
•	Добавь в класс Cat метод finalize.
•	Метод finalize ничего не должен возвращать (тип возвращаемого значения void).
•	Метод finalize должен уменьшать переменную catCount на 1.

*/

public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount ++;
    }
    public void finalize(){
        catCount --;
    }

    public static void main(String[] args) {

    }
}

/* 
Класс StringHelper
делать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";

        for(int i= 0; i < 5 ; i++) {
            result += s;
        }

            return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        
        for(int i= 0; i < count ; i++){
            result += s;
        }

            return result;
    }

    public static void main(String[] args) {
        
    }
}


/* 
Контролируем массу тела

Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и выводить на экран сообщение о индексе массы тела.
Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 25

*/
import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
       
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            
           double massa = weight / (height * height);
           
           
            
            if(massa < 18.5) System.out.println("Недовес: меньше чем 18.5");
            else if (massa > 18.4 && massa < 25) System.out.println("Нормальный: между 18.5 и 25");
            else if (massa > 24.9 && massa < 30) System.out.println("Избыточный вес: между 25 и 30");
            else if (massa >= 30) System.out.println("Ожирение: 30 или больше");
        }
    }
}


package com.javarush.task.task06.task0612;

/* 
Калькулятор

Сделать класс Calculator, у которого будут 5 статических методов:
int plus(int a, int b) - возвращает сумму чисел a и b
int minus(int a, int b) - возвращает разницу чисел a и b
int multiply(int a, int b) - возвращает результат умножения числа a на число b
double division(int a, int b) - возвращает результат деления числа a на число b
double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(int a, int b) {
        double c = (double) a / (double) b;
        return c;
    }

    public static double percent(int a, int b) {
        double p = (double)b * ((double)a /100);
        return p;
    }

    public static void main(String[] args) {

    }
}


/* 
Расстояние между двумя точками

Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.


*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        
        double getDistance = ((x2 - x1) * (x2 - x1)) + ((y2 - y1)*(y2 - y1));
        getDistance =  Math.sqrt(getDistance);
        
        return getDistance;
        
    }

    public static void main(String[] args) {

    }
}

/* 
Кот и статика

В классе Cat создай статическую переменную public int catCount.
Создай конструктор public Cat().
 Пусть при каждом создании кота (нового объекта Cat) статическая переменная catCount увеличивается на 1. 
 Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

public class Solution {
    public static void main(String[] args) {
       Cat cat1 = new Cat();
       Cat cat2 = new Cat();
       Cat cat3 = new Cat();
       Cat cat4 = new Cat();
       Cat cat5 = new Cat();
       Cat cat6 = new Cat();
       Cat cat7 = new Cat();
       Cat cat8 = new Cat();
       Cat cat9 = new Cat();
       Cat cat10 = new Cat();

        System.out.println(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;

       public Cat(){
           catCount ++;
       }
    }
}



/*
Написать функцию, которая возвращает минимум из  чисел.

 */



import java.util.Scanner;

public class AppStart {


    public static int minForst(int a, int b) {
        int min;
        if(a < b){
            min = a ;
        } else {
            min = b;
        }
        return min ;

        //return a<b?a:b;
    }

    public static int minThri(int a, int b, int c) {
        int min = 1000;
        if(a < b){
            min = a ;
        }
        if(min > b ) {
            min = b;
        }
        if(min > c ) {
            min = c;
        }
        return min ;


        /*
        if (a <= b && a <= c)
            return a;
        else if (b <= a && b <= c)
            return b;
        else return c;
         */
    }

    public static int min(int a, int b, int c, int d) {
        int m = min(a,b);

        int min = m;


        if(min > c ) {
            min = c;
        }
        if(min > d ) {
            min = d;
        }
        return min ;


    }

    public static int min(int a, int b) {
        return a<b?a:b;

    }

    public static int w(){
        Scanner sc = new Scanner(System.in);
        int numerot= Integer.parseInt(sc.nextLine());

        if(numerot >= 1) {

            System.out.println(numerot * 2);
        }

        if (numerot <= -1){

            System.out.println(numerot-1);
        }

        if (numerot == 0){
            System.out.println(0);
        }

        return numerot;
    }


    public static void main(String[] args) {

        System.out.println("******возвращает минимум из двух чисел*******");
        System.out.println(minForst(12, 33));
        System.out.println(minForst(-20, 0));
        System.out.println(minForst(-10, -20));

        System.out.println("******возвращает минимум из трёх чисел*******");
        System.out.println(minThri(1, 2, 3));
        System.out.println(minThri(-1, -2, -3));
        System.out.println(minThri(3, 5, 3));
        System.out.println(minThri(5, 5, 10));

        System.out.println("******возвращает минимум *******");
        System.out.println(min(-20, -77));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -100, -30, 40));
        System.out.println(min(-20, -10, -80, 40));
        System.out.println(min(-20, -10, -99, -15));
  
    }

}

/* 
Сумма цифр трехзначного числа

Напиши код метода sumDigitsInNumber(int number). 
Метод на вход принимает целое трехзначное число. 
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
       
        int s = number/100;
        int d = (number - s*100)/10;
        int e = (number - s*100 - d*10);
        return s+d+e;
       
    }
}

/*
Сумма цифр трехзначного числа

Напиши код метода sumDigitsInNumber(int number). 
Метод на вход принимает целое трехзначное число. 
Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15
*/

public class Main {

    public static void main(String[] args) {
        sumDigitsInNumber(546);
    }


    public static void sumDigitsInNumber(int number) {
        int sum = 0;
        char[] a = String.valueOf(number).toCharArray();
        for (int i = 0; i < a.length; i++){
            sum += Integer.parseInt(String.valueOf(a[i]));
        }
        System.out.println("The sum is " + sum);

    }
}

/* 
Консоль-копилка

Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, 

*/

                                                                                                                                                                                                                                                                                                                                                                                             
import java.io.*;                                                                                                                                                                                                                                                                                                                                                               


public class Solution {
    public static void main(String[] args) throws Exception {
        
       
 BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
       
        int a ;
        int result = 0;
        String s;

        while (true) {
            s = buffer.readLine();
            if (s.equals("сумма")) {
                break;
            }
            a = Integer.parseInt(s);
            result = result+a;
          }

        System.out.println(result);
       
       
    }
}

package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        int max = -2147483648;;
        int a = 0;

        if(n > 0){
            while (a < n){
                int b= Integer.parseInt(sc.nextLine());
                max = b >= max ? b:max;
                ++a;
            }
            System.out.println(max);

        }


    }
}

/*
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input N");
        int n = userInput(0);
        System.out.printf("Input %d numbers:\n", n);
        int temp;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            temp = userInput(Integer.MIN_VALUE);
            if (max < temp) max = temp;
        }
        System.out.println("Max: " + max);
    }

    private static int userInput(int range) {
        Scanner scan = new Scanner(System.in);
        int result;

        while (true) {
            System.out.print(">>> ");
            try {
                result = Integer.parseInt(scan.nextLine());
                if (result <= range) throw new NumberFormatException();
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Try again.");
            }
        }
        return result;
    }

}



/*
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
•	Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
•	Программа должна выводить текст на экран.
•	Выведенный текст должен соответствовать заданию.
*/


import java.io.*;

public class Main {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());


        while (number!=0){

            if (number%2==0){
                even++;}
            else{
                odd++;
            }
            number = number/10;

        }

        System.out.println("Even: " + even + " " + "Odd: " + odd);
    }
}


/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human  vasya = new Human("Vasya", true, 40);
        Human  petya = new Human("Petya", true, 50); 
        Human  katya = new Human("Katya", false, 30); 
        Human  alla = new Human("Alla", false, 20);
        
        Human sasha = new Human("Sasha",true, 10, vasya, alla); 
        Human lena = new Human("Lena",false, 11, vasya, katya); 
        Human dima = new Human("Dima",true, 5, vasya, alla); 
        Human goga = new Human("Goga",true, 1, vasya, alla);                                     
        Human mira = new Human("Mira",false, 3, vasya, alla);                                                  
        
        System.out.println(vasya.toString());
        System.out.println(petya.toString()); 
        System.out.println(katya.toString());
        System.out.println(alla.toString());
        
        System.out.println(sasha.toString());
        System.out.println(lena.toString());
        System.out.println(dima.toString());
        System.out.println(goga.toString());
        System.out.println(mira.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        
        public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        }
        
        public Human(String name, boolean sex, int age, Human father, Human mother){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
        }
        

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах

Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
В классе Solution создай статический публичный метод int[] getInts().
Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
В методе main создай и проициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int[] list2 = getInts();
       
         int maximum = -2147483648;
         int minimum = 2147483647;
         
         for (int i = 0; i < list2.length; i++)
        {
            if (list2[i] < minimum)
                minimum = list2[i];
        }

        for (int i = 0; i < list2.length; i++)
        {
            if (list2[i] > maximum)
                maximum = list2[i];
        }
         

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        return list;
    }
}

/*

Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке

ТРЕБОВАНИЯ К ЗАДАЧИ

Программа должна выводить число на экран.
Программа должна считывать значения с клавиатуры.
В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
Программа должна добавлять в коллекцию 10 чисел, согласно условию.
Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
      Scanner scan = new Scanner(System.in);
        
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(scan.nextInt());
        }
 
        int current = 1, max = 1;
         for (int i = 1; i < arr.size(); i++) {
           if (arr.get(i).equals(arr.get(i - 1))){
                current++;
                if (current > max) {
                    max = current;
                }
            } else current = 1;
        }
        System.out.println(max);
 
    }
}

