package com.NaumDeveloper.JavaRush;// 3.14  Ввести с клавиатуры отдельно Имя, число1, число2.

/*
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

 */

import java.io.*;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) throws Exception {
            System.out.print(new BufferedReader(new InputStreamReader(System.in)).readLine() + " получает "
             + new BufferedReader(new InputStreamReader(System.in)).readLine() +
              " через " + new BufferedReader(new InputStreamReader(System.in)).readLine() + " лет.");
        }
    }
