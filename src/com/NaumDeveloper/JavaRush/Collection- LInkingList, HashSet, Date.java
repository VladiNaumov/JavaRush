package com.NaumDeveloper.JavaRush;

import java.util.LinkedList;
 
public class Program{
      
    public static void main(String[] args) {
          
        LinkedList<String> states = new LinkedList<String>();
          
        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1
        
        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){
          
            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Germany")){
          
            System.out.println("List contains Germany");
        }
          
        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента
          
        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление второго элемента
          
        for(Person p : people){
          
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}
class Person{
      
    private String name;
    public Person(String value){
          
        name=value;
    }
    String getName(){return name;}
}




import java.util.*;
 
public class Program{
      
    public static void main(String[] args) {
          
        Map<Integer, String> states = new HashMap<Integer, String>();
       states.put(1, "Germany");
       states.put(2, "Spain");
       states.put(4, "France");
       states.put(3, "Italy");
         
       // получим объект по ключу 2
       String first = states.get(2);
       System.out.println(first);
       // получим весь набор ключей
       Set<Integer> keys = states.keySet();
       // получить набор всех значений
       Collection<String> values = states.values();
       //заменить элемент
       states.replace(1, "Poland");
       // удаление элемента по ключу 2
       states.remove(2);
       // перебор элементов
       for(Map.Entry<Integer, String> item : states.entrySet()){
         
           System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
       }
          
       Map<String, Person> people = new HashMap<String, Person>();
       people.put("1240i54", new Person("Tom"));
       people.put("1564i55", new Person("Bill"));
       people.put("4540i56", new Person("Nick"));
         
       for(Map.Entry<String, Person> item : people.entrySet()){
         
           System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
       }
    }
}
class Person{
      
    private String name;
    public Person(String value){
          
        name=value;
    }
    String getName(){return name;}
}



import java.util.HashSet;
import java.util.Set;

/* 
Set из растений

Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

public class Solution {
    public static void main(String[] args) {
         Set<String> set = new HashSet<String>();                                                                                                                                                      
                                                                                                                                                              
        set.add("арбуз");                                                                                                                                                      
        set.add("банан");                                                                                                                                                      
        set.add("вишня");                                                                                                                                                      
        set.add("груша");                                                                                                                                                      
        set.add("дыня");                                                                                                                                                      
        set.add("ежевика");                                                                                                                                                      
        set.add("женьшень");                                                                                                                                                      
        set.add("земляника");                                                                                                                                                      
        set.add("ирис");                                                                                                                                                      
        set.add("картофель");  
        
        for(String s: set){
            
            System.out.println(s);
        }

    }
}

/* 
Map из 10 пар

Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень

*/

import java.util.HashMap;                                                                                                                                                                                                        
import java.util.Iterator;                                                                                                                                                                                                        
import java.util.Map;  

public class Solution {
    public static void main(String[] args) {

    Map<String, String> map = new HashMap<String,String>();

        map.put("арбуз", "ягода");
        map.put("банан" ,"трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for(Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);}

    }
}


import java.util.Map;

/* 
Коллекция Map из котов


Есть класс Cat с полем имя (name, String).
Создать коллекцию Map<String, Cat> (реализация HashMap).
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.



*/

import java.util.HashMap;                                                                                                                                                                                                        
import java.util.Iterator;                                                                                                                                                                                                        
import java.util.Map;


public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        
            Map<String, Cat>pair = new HashMap<>();
            for(int i=0;i<cats.length;i++){
            pair.put(cats[i], new Cat(cats[i]));
            
            }


        return pair;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}


import java.util.HashMap;
import java.util.Map;

/* 
Вывести на экран список ключей

Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        for(Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
        }
    }
}

import java.util.HashMap;
import java.util.Map;


/* 
На экране — значения!

Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        
         for (Map.Entry<String, String> pair : map.entrySet())
        {
        String key = pair.getKey();                      
        String value = pair.getValue();                  
      
        System.out.println(value);
        
        }
        
        
    }
}


import java.util.HashMap;
import java.util.Map;

/* 
Коллекция Map из Object

Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5

Требования:


*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for (Map.Entry<String,Object>pair:map.entrySet()){
            String key=pair.getKey();
            Object value=pair.getValue();
            System.out.println(key+" - " +value);
        }

    }
}


/* 
LinkedList и ArrayList
Нужно создать два списка - LinkedList и ArrayList.
*/

import java.util.*;

public class Solution {
    public static Object createArrayList() {
       ArrayList<String>list = new ArrayList();
       return list;

    }

    public static Object createLinkedList() {
         LinkedList<Object> linkinList = new LinkedList<Object>();
            return linkinList;
    }

    public static void main(String[] args) {

    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

Требования:
Программа не должна выводить текст на экран.
Программа не должна считывать значения с клавиатуры.
Класс Solution должен содержать только 5 методов.
Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
*/

public class Solution {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
         for(int i=0;i<10000;i++){                                                                                                                                                       
         list.add(i);                                                   
         }   

    }

    public static void get10000(List list) {
        for(int i=0;i<10000;i++){                                                                                                                                                       
        list.get(i);                                                   
        } 

    }

    public static void set10000(List list) {
       for(int i=0;i<10000;i++){                                                                                                                                                       
        list.set(i,list.get(i));                                                   
        } 

    }

    public static void remove10000(List list) {
        for(int i=0;i<10000;i++){                                                                                                                                                       
        list.remove(0);                                                   
        } 

    }
}

import java.util.ArrayList;                                                                                                    
import java.util.LinkedList;                                                                                                    
import java.util.List;                                                    
import java.util.Date; 

/* 
Время для 10 тысяч вставок
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date date1=new Date(); 
        long n1 = date1.getTime();   

        insert10000(list);

        Date date2=new Date();                                                                                                  
        long n2 = date2.getTime(); 
        
        return (n2-n1);

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date; 

/* 
Время для 10 тысяч вызовов get
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        Date date1=new Date(); 
        long n1 = date1.getTime();

        get10000(list);

        Date date2=new Date();                                                                                                  
        long n2 = date2.getTime(); 
        
        return (n2-n1);

    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.
*/

public class Solution {
    public static List getListForGet() {
        ArrayList arrayList= new ArrayList();
        return arrayList;

    }

    public static List getListForSet() {
        ArrayList arrayList= new ArrayList();
         return arrayList;

    }

    public static List getListForAddOrInsert() {
        return new LinkedList();

    }

    public static List getListForRemove() {
        return new LinkedList();

    }

    public static void main(String[] args) {

    }
}


import java.util.Set;
import java.util.HashSet;
/* 
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

*/

public class Solution {
    
    public static Set<String> createSet() {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) 
        set.add("Л" + i);
        return set;
    }

    

    public static void main(String[] args) {

    }

}

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
         Map<String,String> map = new HashMap<>();
            for (int i = 0; i <10 ; i++)
            map.put("Sim", "i");
            
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static Map<String, Integer> createMap() {
          Map<String, Integer> map = new HashMap<>();
          map.put("Sim", 600);
          map.put("Tom", 900);
          map.put("Arbus", 300);
          map.put("Baby", 450);
          map.put("Cat", 1000);
          map.put("Eat", 900);
          map.put("Food", 700);
          map.put("Gevey", 1500);
          map.put("Hugs", 230);
          map.put("Comp", 3000);
          
          return map;
          
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        
         Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if(value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    
    public static Set<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++)
            set.add(i);
            return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // Вывести в консоль записи
       Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            if (it.next() > 10) it.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

*/

public class Solution {


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) 
                it.remove();
        }
      System.out.println("set = new HashSet<>(); " + set);
    }

}
