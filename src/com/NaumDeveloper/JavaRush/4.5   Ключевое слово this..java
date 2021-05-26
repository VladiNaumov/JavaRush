package com.NaumDeveloper.JavaRush;// 3.20   Ключевое слово this.

/*


 */

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        human1.setName("TOM");
        human1.getInfo();

        Human human2 = new Human();
        human2.setAge(25);
        human2.setName("GOM");
        human2.getInfo();

        Human human3 = new Human();
        human3.setAge(35);
        human3.setName("KYA");
        human3.getInfo();
    }
}

class Human{
     String name;
     int age;


     public void setName(String name) {
         this.name = name;
     }

    public void setAge(int age){
         this.age=age;

    }

    public void getInfo() {
        System.out.println(name+ ", "+age);
    }

}


