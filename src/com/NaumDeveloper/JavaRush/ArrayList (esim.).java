package com.NaumDeveloper.JavaRush;


class TestClass
{
 public static void main (String[] args) throws Java.lang.Exception
 {
   // создаем список массивов Object
   ArrayList aList = new ArrayList();
   aList.add("Sunday"); // добавление элемента
   aList.add("Monday");
   aList.add("Tuesday");
 }
}


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
Iterator ir=aList.iterator();
  while(ir.hasNext()){
System.out.println(ir.next());
}

// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
Iterator ir=aList.iterator();
  while(ir.hasNext()){
System.out.println(ir.next());
}

//Как найти длину / размер ArrayList в Java?
//Используя метод size() класса ArrayList, мы можем легко определить размер ArrayList. Этот метод возвращает количество элементов в объекте ArrayList.

// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.size());


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.size());


Как получить конкретный элемент ArrayList?
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.get(1));

// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.get(1));


Доступ к элементам в ArrayList можно получить с помощью целочисленного индекса, а индексы ArrayList начинаются с нуля. Таким образом, aList.get (1) возвращает второй элемент из ArrayList.

Как получить первый элемент Arraylist?
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.get(0));


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.get(0));


Поскольку индексы ArrayList начинаются с нуля, aList.get (0) возвращает первый элемент ArrayList.

Как получить последний элемент Arraylist?
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.get(aList.size()-1));


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.get(aList.size()-1));
AList.size() возвращает итоговые элементы в ArrayList. Поскольку индексы ArrayList начинаются с нуля, aList.size() - 1 возвращает последний элемент ArrayList.

Как удалить все элементы из Java ArrayList?
Вы можете использовать два разных метода для удаления arraylist в Java. Это ArrayList.clear() и ArrayList.removeAll()

//ArrayList.clear():
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.size());
aList.clear();
System.out.println(aList.size());


//ArrayList.clear():
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.size());
aList.clear();
System.out.println(aList.size());


Пример ArrayList.removeAll():


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.size());
aList.removeAll(aList);
System.out.println(aList.size());


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println(aList.size());
aList.removeAll(aList);
System.out.println(aList.size());


Удалить объект (удалить (объект)):
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
aList.remove("Monday");


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
aList.remove("Monday");

Здесь мы передаем аргумент как строковый объект «Понедельник», поэтому он будет удален из коллекции.

Удалить по индексу:
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
aList.remove(1);


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
aList.remove(1);
Здесь мы передаем аргумент как index remove (1) «Monday», поэтому он будет удален из коллекции.

Как отсортировать ArrayList в Java?
В ArrayList элементы помещаются по мере их вставки. Но при кодировании вы часто нуждаетесь в них в некотором порядке. для сортировки ArrayList используется метод sort() класса Collections.

// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println("Before sort.....");
Iterator ir=aList.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());
}
Collections.sort(aList);
System.out.println("After sort.....");
ir=aList.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());
}


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
System.out.println("Before sort.....");
Iterator ir=aList.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());
}
Collections.sort(aList);
System.out.println("After sort.....");
ir=aList.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());
}


Сортировка ArrayList в обратном порядке?
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
Collections.sort(aList,Collections.reverseOrder());
Iterator ir=aList.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());
}


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
Collections.sort(aList,Collections.reverseOrder());
Iterator ir=aList.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());
}


Поиск элемента в Java ArrayList
Вы можете проверить, существует ли значение в Java ArrayList, используя следующие методы: ArrayList.contains(), ArrayList.indexOf() и ArrayList.lastIndexOf()

// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
// Использование метода contains
if (aList.contains("Monday")) {
  System.out.println("Account found");
} else {
  System.out.println("Account not found");
}

// использование метода indexOf
int val = aList.indexOf("Monday");
if (val !=-1) {
  System.out.println("Item found");
} else {
  System.out.println("Item not found");
}


// использование метода lastIndexOf
int val = aList.lastIndexOf("Monday");
if (val !=-1) {
  System.out.println("Item found");
} else {
  System.out.println("Item not found");
}


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");

// Использование метода contains
if (aList.contains("Monday")) {
  System.out.println("Account found");
} else {
  System.out.println("Account not found");
}

// использование метода indexOf
int val = aList.indexOf("Monday");
if (val !=-1) {
  System.out.println("Item found");
} else {
  System.out.println("Item not found");
}

// использование метода lastIndexOf
int val = aList.lastIndexOf("Monday");
if (val !=-1) {
  System.out.println("Item found");
} else {
  System.out.println("Item not found");
}

Преобразование массива в массив
Класс ArrayList имеет метод, называемый toArray(), который мы можем использовать для преобразования ArrayList в массивы.

// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
String[] arr = (String[])aList.toArray(new String[aList.size()]);
for(String item : arr)
  System.out.println(item);


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
String[] arr = (String[])aList.toArray(new String[aList.size()]);
for(String item : arr)
  System.out.println(item);


Преобразование массива в ArrayList
// создаем массив Object
String days[]={"Sunday", "Monday", "Tuesday"};
ArrayList < String> arrList= new ArrayList < String>(Arrays.asList(days));
for(String item : arrList)
  System.out.println(item);


// создаем массив Object
String days[]={"Sunday", "Monday", "Tuesday"};
ArrayList < String> arrList= new ArrayList < String>(Arrays.asList(days));
for(String item : arrList)
  System.out.println(item);


Преобразование ArrayList в строку
Метод String join() поможет вам преобразовать ArrayList в String. Метод Java string join() возвращает строку, связанную с данным разделителем. В методе объединения строк для каждого элемента копируется разделитель.

// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
String result = String.join(",", aList);
System.out.println(result);


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
String result = String.join(",", aList);
System.out.println(result);


Преобразование ArrayList в список
// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
 List list = aList;
Iterator ir=list.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());


// создаем список массивов Object
ArrayList aList = new ArrayList();
aList.add("Sunday");
aList.add("Monday");
aList.add("Tuesday");
 List list = aList;
Iterator ir=list.iterator();
while(ir.hasNext()){
  System.out.println(ir.next());


//Следующая программа Java иллюстрирует большинство вышеупомянутых методов в одной программе


import Java.util.*;
class TestClass
{
  public static void main (String[] args) throws Java.lang.Exception
  {
    // создаем новый объект ArrayList
      ArrayList aList = new ArrayList();
      aList.add("Sunday");
      aList.add("Monday");
      aList.add("Wednesday");
      // использование Iterator для просмотра всех элементов в ArrayList
      Iterator < String> itr = aList.iterator();
          while(itr.hasNext()){
          System.out.println(itr.next());
      }
      // добавление элемента по указанному индексу
      aList.add(2,"Tuesday");
      System.out.println(aList);
      // Извлечение элементов ArrayList по индексу
      System.out.println(aList.get(2));
      // Поиск элемента в ArrayList
      if(aList.contains("Monday"))
          System.out.println("Item Found");
      else
          System.out.println("Item not Found");
      // Удаление одного элемента из ArrayList по индексу
      aList.remove(1);
      System.out.println(aList);
      // Удаление всех элементов из ArrayList
      aList.clear();
      // Проверка вектора - это ArrayList или нет.
      if(aList.isEmpty())
          System.out.println("ArrayList Empty !!");
      else
          System.out.println("ArrayList Contains: " + aList.size() + " elements  !!");
  }
}

import Java.util.*;
class TestClass
{
  public static void main (String[] args) throws Java.lang.Exception
  {
    // создаем новый объект ArrayList
      ArrayList aList = new ArrayList();
      aList.add("Sunday");
      aList.add("Monday");
      aList.add("Wednesday");
      // использование Iterator для просмотра всех элементов в ArrayList
      Iterator < String> itr = aList.iterator();
          while(itr.hasNext()){
          System.out.println(itr.next());
      }
      // добавление элемента по указанному индексу
      aList.add(2,"Tuesday");
      System.out.println(aList);
      // Извлечение элементов ArrayList по индексу
      System.out.println(aList.get(2));
      // Поиск элемента в ArrayList
      if(aList.contains("Monday"))
          System.out.println("Item Found");
      else
          System.out.println("Item not Found");
      // Удаление одного элемента из ArrayList по индексу
      aList.remove(1);
      System.out.println(aList);
      // Удаление всех элементов из ArrayList
      aList.clear();
      // Проверка вектора - это ArrayList или нет.
      if(aList.isEmpty())
          System.out.println("ArrayList Empty !!");
      else
          System.out.println("ArrayList Contains: " + aList.size() + " elements  !!");
  }
}