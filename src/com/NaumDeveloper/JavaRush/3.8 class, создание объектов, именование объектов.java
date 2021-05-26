package com.NaumDeveloper.JavaRush;// 3.14 class, создание объектов, именование объектов

/*
Задачи на вывод

Привет StarCraft

Создать 5 зергов, 3 протосса и 4 террана.

Требования:
•	Нельзя изменять классы Zerg, Protoss и Terran.
•	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
•	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
•	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.

 */



public class Main {


        public static void main(String[] args) {

        Zerg zerg = new Zerg();
        zerg.name="Mark";

        Zerg zerg1=new Zerg();
        zerg1.name="Hark";

        Zerg zerg2=new Zerg();
        zerg2.name="Klar";

        Zerg zerg3=new Zerg();
        zerg3.name="Klerk";

        Zerg zerg4=new Zerg();
        zerg4.name="Hard";

        Protoss protoss = new Protoss();
        protoss.name="Gek";

        Protoss protoss1 = new Protoss();
        protoss1.name="Mer";

        Protoss protoss2= new Protoss();
        protoss2.name="Kla";

        Terran terran = new Terran();
        terran.name="klg";

        Terran terran1 = new Terran();
        terran1.name="nabi";

        Terran terran2 = new Terran();
        terran2.name="Ger";

        Terran terran3 = new Terran();
        terran3.name="haaa";


        }

        public static class Zerg {
            public String name;
        }

        public static class Protoss {
            public String name;
        }

        public static class Terran {
            public String name;
        }
}