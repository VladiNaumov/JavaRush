package com.NaumDeveloper.JavaRush;
/* 
В начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

*/
import java.util.Scanner;
import java.util.ArrayList; 

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<String>(); 
       
        for (int i= 0; i < 10; i++){
            String s = sc.nextLine();
            list.add(0,s);
           
        }
        
         for (int i= 0; i < 10; i++){
             
             System.out.println(list.get(i));
             
         }
        
    }
}


public static void main(String[] args) throws IOException
{
    
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) list.add(data[i]);

    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();
    
    for (int i = 0; i < list.size(); i++)
    {
        Integer x = list.get(i);
        if (x % 2 == 0)
            even.add(x);
        else
        odd.add(x);
	}
}


/* 
Что за список такой?

1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


*/
import java.util.ArrayList; 

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); 
              list.add("TEST");
              list.add("ST");
              list.add("ES");
              list.add("TT");
              list.add("TST");
            
            
         System.out.println(list.size());      
              
         for (int i= 0; i < list.size(); i++){
             
             System.out.println(list.get(i));
             
         }  
        
    }
}


/* 
Слова в обратном порядке

Введи с клавиатуры 5 слов в список строк. 
Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
 
*/


import java.util.Scanner;
import java.util.ArrayList; 

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<String>(); 
       
        for (int i= 0; i < 5; i++){
            String s = sc.nextLine();
            list.add(s);
           
        }
           list.remove(2);
        
        
         for (int i = 3; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }
}

/* 
Общение одиноких массивов
*/


import java.util.Scanner;
import java.util.ArrayList; 

public class Solution {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<String>(); 
        ArrayList<Integer> numerot = new  ArrayList<Integer>();
       
        for (int i= 0; i < 10; i++){
            String s = sc.nextLine();
            list.add(s);
           
        }
           
        
         for (int i = 0; i < list.size(); i++) {

            numerot.add(list.get(i).length());
        }

        for (int i = 0; i < numerot.size(); i++) {
            System.out.println(numerot.get(i));

        }
        
    }
}

/* 
Переверни массив

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.


*/

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int [] numerot = new int [10];
        
          for (int i= 0; i < numerot.length; i++){
            int a = sc.nextInt();
            numerot[i] = a;
          }
          
          for (int i= 9; i >= 0; i--){
              
              System.out.println(numerot[i]);
          }
        
    }
}


/* 
Общение одиноких массивов

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

*/


import java.util.Scanner;
import java.util.ArrayList; 

public class Solution {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);
   

        String [] list  = new String [10];
        
        int [] numerot = new int [10];

        for (int i= 0; i < 10; i++){
            String s = sc.nextLine();
            list[i] = s;
        }
        
        
        for (int i = 0; i < list.length; i++) {
             numerot[i] = list[i].length(); 
        }
        
        
         for (int i = 0; i < 10; i++) {
            System.out.println(numerot[i]);

        }
       
    }
}


/* 
Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

*/

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        
         Scanner sc = new Scanner(System.in);
          int[]a  = new int[20];
          
          int[]d  = new int[10];
          int[]e  = new int[10];
       
        
          for (int i = 0; i < a.length; i++)
          {
            a[i] = sc.nextInt();
          }
          
          int[]b= Arrays.copyOf(a,10);

          int[]c= Arrays.copyOfRange(a,10,20);
         
          for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }
         
    }
          
}





/* 
Статические коты

. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

import java.util.ArrayList;

public class Cat {
    
    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    
    public Cat() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
       for (int i = 0; i < Cat.cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}


/* 
Минимальное число статиков

Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.


*/

public class Solution {
     public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Числа по возрастанию

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerot = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(sc.nextLine());
            numerot.add(a);
            Collections.sort(numerot);

        }


        for (int i = 0; i < numerot.size(); i++) {
            System.out.println(numerot.get(i));
        }
        
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


       String dedaname = reader.readLine();
        Cat catded= new Cat(dedaname);

        String babaname = reader.readLine();
        Cat catbaba = new Cat(babaname);

        String fatername=reader.readLine();
        Cat catfather=new Cat(fatername,null,catded);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catbaba,null);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catfather);

        String sonname = reader.readLine();
        Cat catson= new Cat(sonname, catMother, catfather);
        
        System.out.println(catded);
        System.out.println(catbaba);
        System.out.println(catfather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catson);
      
    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2= parent2;}


        @Override
        public String toString() {
           if (parent1 == null && parent2 == null)
                return "The cat's name is " + name + ", no mother, no father";

            else if(parent1 == null )
                return "The cat's name is " + name + ", no mother, father is " + parent2.name;

            else if( parent2 == null)
            return "The cat's name is " + name + ", mother is "+ parent1.name +", no father";
            else
            return "The cat's name is " + name + ", mother is " + parent1.name+ ", father is " + parent2.name;


        }
    }
}

/* 
Массивный максимум

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
import java.util.Scanner;
import java.io.IOException;
public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
       Scanner sc = new Scanner(System.in);
            int[] my = new int[20];
            for (int i = 0; i < my.length; i++)
                my[i] = Integer.parseInt(sc.nextLine());
             
            return my;
    }

    public static int max(int[] array) {
       int max = array[1];
            for (int i = 0; i < array.length; i++){
                 max = array[i] >= max ? array[i]:max;
            }
        return max;
    }
}

/* 
Массив из строчек в обратном порядке

1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String [] string = new String[10];

        string[0] = ("TEST");
        string[1] =  ("HEI");


        for (int i = 2; i < 10; i++) {

            string[i] = sc.nextLine();

         }


        for (int i = 9; i >= 0; i--) {
            System.out.println(string[i]);
        }
    }
}

/* 
Удалить и вставить

1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
            ArrayList<String> s = new ArrayList<String>();

            for (int i = 0; i < 5; i++) {
                String a = sc.nextLine();
                s.add(a);

            }

            for (int i = 0; i < 13; i++) {

              s.add(0, s.remove(s.size()-1));
            }


            for (int i = 0; i < s.size(); i++) {
                System.out.println(s.get(i));
            }
    }
}



/* 
Улицы и дома

1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.


*/
import java.io.IOException;                                                                                                                                                                                                        
import java.io.*;    


public class Solution {
    public static void main(String[] args) throws IOException {
    
    int[] city = createCity();                                                                                                    
    oddOrEven(city);                                                                                                
     }                                                                                                    
                                                                                                    
    public static int[] createCity() throws IOException {                                                                                                    
                                                                                                    
     BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));                                                                                                    
     int[] city = new int[15];                                                                                                    
     for(int i =0; i < city.length; i++) 
     {                                                                                                    
          city[i] = Integer.parseInt(reader.readLine());                                                                                                    
      }                                                                                                    
       return city;                                                                                                    
      }                                                                                                    
                                                                                                    
    public static void oddOrEven(int[] city) {                                                  
          int even = 0;                                                  
          int odd = 0;                                                  
          for (int i = 0; i < city.length; i++) {                                                  
               
               if (i % 2 == 0)
                even += city[i];
              else
                odd += city[i];                                                
                                                         
     }  
     
    if (even > odd) {                                                  
      System.out.println("В домах с четными номерами проживает больше жителей.");}                                                  
    else                                                  
      System.out.println("В домах с нечетными номерами проживает больше жителей.");                                                  
                   
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Вывести числа в обратном порядке

Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.

Подсказка:
Не забудь импортировать класс: java.util.ArrayList;

*/

import java.util.ArrayList;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerot = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(sc.nextLine());
            numerot.add(a);
          }


        for (int i = 9; i >= 0; i--) {
            System.out.println(numerot.get(i));
        }
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Не компилируется задача про котиков

Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.

Пример:
Cat's name: Barsik, age: 6, weight: 5, tail: 22
Cat's name: Murka, age: 8, weight: 7, tail: 20

*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
            String name = reader.readLine();
           

            if (name == null || name.isEmpty()) {
                break;
            }
            
            int  age = Integer.parseInt(reader.readLine());
            int  weight = Integer.parseInt(reader.readLine());
            int  tailLength = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tailLength );
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;
        
         public Cat(String name) {
            this.name = name;
        }


        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}




/* 
Это конец

Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> str = new ArrayList<String>();
        
        while (true) {
            String s = reader.readLine();
            if (s.equals("end"))
                break;

             str.add(s);
        }
        
        for (int i = 0; i < str.size(); i++) {
                System.out.println(str.get(i));
            }
    }
}


import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();

        for (int a = 0; a < 5; a++) {
           
            strings.add(reader.readLine());

        }
            int numerot = strings.get(0).length();

            for (int b = 0; b < strings.size(); b++) {

                if (strings.get(b).length() > numerot){

                    numerot = strings.get(b).length();

                }

            }

        for (String s : strings) {
            if (s.length() == numerot) {
                System.out.println(s);
            }
        }
    }
}

/* 
Выражаемся покороче

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>strings = new ArrayList<>();

        for (int a = 0; a < 5; a++) {
            strings.add(reader.readLine());
        }
        
        int numerot = strings.get(0).length();

        for (int b = 0; b < strings.size(); b++) {

                if (strings.get(b).length() < numerot){

                    numerot = strings.get(b).length();

                }

        }

        for (String s : strings) {
            if (s.length() == numerot) {
                System.out.println(s);
            }
        }

    }
}

/* 
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

*/
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        
		//1. Создаем 2 переменные для хранения индексов максимальной и минимальной строк
        // 2. Создаем 2 списка, первый для хранения строк, второй для хранения длин этих строк
		
       ArrayList<String> list = new ArrayList<>();
       ArrayList<Integer> length = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

       //3. Соответственно в цикле заполняем данные масивы (для второго использовала такую конструкцию)
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
            length.add(list.get(i).length());
        }
		
		//4.Ищем индекс максимальной и минимальной строк

        int indexMax = length.indexOf(Collections.max(length));
        int indexMin = length.indexOf(Collections.min(length));


       //5.Сравниваем значения полученных индексов и выводим на экран строку с наименьшим индексом
        if (indexMax > indexMin)
            System.out.println(list.get(indexMin));
        else
            System.out.println(list.get(indexMax));
    }
}


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> list = new ArrayList<>();
         Scanner sc = new Scanner(System.in);


       for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
           
        }
        
        for (int i = 0; i < list.size() -1; i++) {
            if (list.get(i).length() > list.get(i + 1).length()){
                System.out.println(i + 1);
                break;
            }
        }

    }
}


/* 
Удваиваем слова

Введи с клавиатуры 10 слов в список строк.

2. Метод doubleValues должен удваивать слова по принципу:
"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

3. Выведи результат на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
          
        ArrayList<String>list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        
        for (int a = 0; a < 10; a++) {
            list.add(sc.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++)
            System.out.println (result.get(i));
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
       for (int i = 0; i < list.size();i++)
        {
            list.add(i + 1, list.get(i));
            i++;
        }

        return list;
    }
    
 }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела

Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.

Требования:
Объяви переменную типа список строк и сразу проинициализируй ee.
Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
Переставить M первых строк в конец списка.
Выведи список на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         ArrayList<String>list = new ArrayList<>();
         
        int N = Integer.parseInt(reader.readLine());
        int M  = Integer.parseInt(reader.readLine());

        for(int i = 0; i < N; i++){
            list.add(reader.readLine());
        }

        for(int i = 0; i < M; i++){
            list.add(list.get(0));
            list.remove(0);
        }

        for(String word: list)
            System.out.println(word);
         
         
    }
}


/* 
Продолжаем мыть раму

1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.

*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
         ArrayList<String> str = new ArrayList<>();

        str.add("мама");
        str.add("мыла");
        str.add("раму");


            for (int i = 0; i < str.size(); i+=2)
            {
            str.add(i + 1,  "именно");
            }

            for (int i = 0; i < str.size(); i++)
			{
            System.out.println(str.get(i));
			}
        
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

         ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {

            String string = strings.get(i);

            if (strings.get(i).length() % 2 == 0){
                resultStrings.add(string + " " + string);
            }
            else resultStrings.add(string + " " + string + " " + string);
        }


        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i)); 
            
        }
    } 
    
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
       Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<Integer> mainList = new ArrayList<>();
            ArrayList<Integer> threeList = new ArrayList<>();
            ArrayList<Integer> twoList = new ArrayList<>();
            ArrayList<Integer> oneList = new ArrayList<>();


        for (int i = 0; i < 20; i++) {  
            mainList.add(Integer.parseInt(reader.readLine()));
        }
        
        
        
        
       for (int i = 0; i < 20; i++){
            if (mainList.get(i) % 3 == 0 && mainList.get(i) % 2 == 0){
                threeList.add(mainList.get(i));
                twoList.add(mainList.get(i));
            }
            else if (mainList.get(i) % 3 == 0){
                threeList.add(mainList.get(i));
            }
            else if (mainList.get(i) % 2 == 0){
                twoList.add(mainList.get(i));
            }
            else if (mainList.get(i) % 3 != 0 && mainList.get(i) % 2 != 0){
                oneList.add(mainList.get(i));
            }
        }
        
        printList(threeList);
        printList(twoList);
        printList(oneList);
    }

    public static void printList(ArrayList<Integer> list) {
        
        for(int i : list){
            System.out.println(i);
        }
        
    }
}

/*
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
•	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
•	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
•	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
*/



import java.util.ArrayList;


public class Main {


    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {

            if (!list.get(i).contains("р") && list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i++;
            }
            if (list.get(i).contains("р") && !list.get(i).contains("л")) {
                list.remove(i);
                i --;
            }


        }return list;
    }

}




