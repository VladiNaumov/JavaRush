package com.NaumDeveloper.JavaRush;// 7.3 switch опеделяет гласная буква или согласная
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random(47);
        for ( int i = 0; i<100; i++){
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", "+ c + ": ");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': System.out.println("гласная ");
                    break;
                case 'y':
                case 'w': System.out.println("условно гласная ");
                    break;
                 default: System.out.println("согласная ");
            }
        }
    }

}



