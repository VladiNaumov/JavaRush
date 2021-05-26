// обект, конструктор с параметрами, метод (передача значений)

package com.NaumDeveloper.JavaRush;


public class Main {

    public static void main(String[] args) {

        A miesA = new A ("Vladimir", 41);
        A miehaniA  = new A ("Gosha" , 27);

        B miesB = new B(190, 90);

        miesA.print();
        miehaniA.print();

        System.out.println(miesA.henkilotunus="230278-2931");
        System.out.println(miesA.numeron=7);


        miesB.print();
   

    }


}

package com.company;

public class A {
    String name;
    int age;

    double numeron;
    String henkilotunus;

     public A(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void print (){

        System.out.println ("Nimesi: " + name);
        System.out.println ("Age: " + age);

    }

}

package com.company;

public class B {

    double pitus;
    double paina;


    B( double pitus, double paina){

        this.pitus=pitus;
        this.paina=paina;

    }

    void print (){

        System.out.println ("Rost: " + pitus);
        System.out.println ("Ves: " + paina);


    }

}
