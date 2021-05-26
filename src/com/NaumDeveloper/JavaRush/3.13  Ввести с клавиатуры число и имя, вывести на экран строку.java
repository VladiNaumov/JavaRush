package com.NaumDeveloper.JavaRush;// 3.13  Ввести с клавиатуры число и имя, вывести на экран строку

/*
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

 */

import java.io.*;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int age = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            System.out.println(name.trim() + " захватит мир через " + age + " лет. Му-ха-ха!");
        }
    }
