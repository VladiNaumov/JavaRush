package com.NaumDeveloper.JavaRush;// 7.1 Использование строк для управления оператором switch



public class Main {

    
            public static void main(String args[]) {

                String command = "cancel";

                switch (command) {
                    case "connect":
                        System.out.println(" Пoдключeниe ");
                        break;
                    case "cancel":
                        System.out.println(" Oтмeнa ");
                        break;
                    case "diskonnect":
                        System.out.println(" Oтключeниe ");
                        break;

                    default:
                        System.out.println(" Heвepнaя команда! ");


                }
            }
        }
