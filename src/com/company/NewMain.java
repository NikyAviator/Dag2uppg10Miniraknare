package com.mainaair;

import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        String operator = "";
        boolean isRunning = true;
        int tal1 = 0;
        int tal2 = 0;
        int resultat = 0;
        while (isRunning) {
            System.out.println("Välj ett av följande alternativ: ");
            System.out.println("1. Välj ett räknesätt: + eller - eller * eller / ");
            System.out.println("2. Mata in två heltal. ");
            System.out.println("3. Gör uträkningen och skriv resultatet ");
            System.out.println("4. Avsluta programmet ");
            switch (choice.nextInt()) {       //vi måste loopa switch satsen
                case 1:
                    System.out.println("1. Välj räknesätt: ");
                    operator = choice.next();
                    break;
                case 2:
                    System.out.println("2. Mata in två tal");
                    tal1 = choice.nextInt();
                    tal2 = choice.nextInt();
                    break;
                case 3:
                    switch (operator) {
                        case "+" -> resultat = tal1 + tal2;
                        case "-" -> resultat = tal1 - tal2;
                        case "*" -> resultat = tal1 * tal2;
                        case "/" -> resultat = tal1 / tal2;
                        default -> System.err.println("Du kan inte använda detta som operator");

                    }
                    System.out.println("Resultatet är: " + resultat);
                    break;
                case 4:
                    isRunning = false;
            }
        }
    }
}