package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Uppgift11 {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        String operator = "";  //dem fyra räknesätten
        boolean isRunning = true; //för att få while loopen att köra
        int resultat = 0; //variabler som sparar summan etc från alla tal
        int antalTal = 0;  // hur många tal vi matar in i steg 2.
        ArrayList<Integer> minaTal = new ArrayList<Integer>();  //arraylistan för talen som matas in, minaTal.
        while (isRunning) {
            System.out.println("Välj ett av följande alternativ: ");
            System.out.println("1. Välj ett räknesätt: + eller - eller * eller / ");
            System.out.println("2. Mata in flera heltal. ");
            System.out.println("3. Gör uträkningen och skriv resultatet ");
            System.out.println("4. Avsluta programmet ");
            switch (choice.nextInt()) {
                case 1:
                    System.out.println("1. Välj räknesätt: ");
                    operator = choice.next();
                    break;
                case 2:
                    System.out.println("Hur många heltal vill du mata in?");
                    antalTal = choice.nextInt();
                    for (int i = 0; i < antalTal; i++) {
                        System.out.println("Mata in ett tal");
                        int tal = choice.nextInt();
                        minaTal.add(tal);

                    }
                    break;
                case 3:
                    switch (operator) {
                        case "+":
                            for (int i = 0; i < antalTal; i++) {
                                resultat = resultat + minaTal.get(i);
                            }
                            break;
                        case "-":
                            resultat = minaTal.get(0); //för att få första talet som vi sedan tar minus med resten
                            for (int i = 1; i < antalTal; i++) {
                                resultat -= minaTal.get(i);
                            }
                            break;
                        case "*":
                            resultat = minaTal.get(0);
                            for (int i = 1; i < antalTal; i++) {
                                resultat *= minaTal.get(i);
                            }
                            break;
                        case "/":
                            resultat = minaTal.get(0);
                            for (int i = 1; i < antalTal; i++) {
                                resultat /= minaTal.get(i);
                            }
                            break;

                    }
                    System.out.println("Resultatet är: " + resultat);
                    break;
                case 4:
                    isRunning = false;
            }
        }
    }
}
