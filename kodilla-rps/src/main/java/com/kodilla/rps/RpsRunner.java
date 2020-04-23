package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        int wygrane = 0, remisy = 0, gry = 0, przeciwnik, zwyciezca = 0, przegrane = 0;
        final int GRACZ = 1, PRZECIWNIK = 2, REMIS = 3, KAMIEN = 1, PAPIER = 2, NOZYCE = 3;
        Scanner opcjaWyboru = new Scanner(System.in);
        Scanner doIluWygranych = new Scanner(System.in);
        Scanner naImiePrzeciwnik = new Scanner(System.in);
        System.out.print("Jak masz na imie?");
        String naImieP = naImiePrzeciwnik.next();
        System.out.print("Na imie masz: " + naImieP + ", super!");
        System.out.print(" ");
        String graszPonownie = "x";
        do {
            System.out.print("Podaj liczbe, do ilu zwycienstw gramy ?");
            int gramyDo = doIluWygranych.nextInt();

            System.out.print("Gramy do: " + gramyDo + " wygranych.  ");
            do {
                przeciwnik = (int) (Math.random() * 3) + 1;
                System.out.print("Losuj jeden z trzech, gdzie: " + "1 = kamień" + ",2 = papier" + ",3 = nożyce");

                int player = opcjaWyboru.nextInt();

                System.out.print(naImieP + " wybrałeś:");
                switch (player) {
                    case KAMIEN:
                        System.out.println(" kamień");
                        break;
                    case PAPIER:
                        System.out.println(" papier");
                        break;
                    case NOZYCE:
                        System.out.println(" nożyce");
                        break;
                }
                System.out.print("Ja wybrałem:");
                switch (przeciwnik) {
                    case KAMIEN:
                        System.out.println(" kamień");
                        if (player == NOZYCE) {
                            zwyciezca = PRZECIWNIK;
                        } else if (player == PAPIER) {
                            zwyciezca = GRACZ;
                        } else {
                            zwyciezca = REMIS;
                        }
                        break;
                    case PAPIER:
                        System.out.println(" papier");
                        if (player == KAMIEN) {
                            zwyciezca = PRZECIWNIK;
                        } else if (player == NOZYCE) {
                            zwyciezca = GRACZ;
                        } else {
                            zwyciezca = REMIS;
                        }
                        break;
                    case NOZYCE:
                        System.out.println(" nożyce");
                        if (player == PAPIER) {
                            zwyciezca = PRZECIWNIK;
                        } else if (player == KAMIEN) {
                            zwyciezca = GRACZ;
                        } else {
                            zwyciezca = REMIS;
                        }
                }
                gry++;
                if (zwyciezca == GRACZ) {
                    wygrane++;
                    System.out.println("W rundzie " + gry + " wygrałeś: " + naImieP + "!");
                    System.out.println();
                } else if (zwyciezca == PRZECIWNIK) {
                    przegrane++;
                    System.out.println("W rundzie " + gry + ": ja wygrałem !");
                    System.out.println();
                } else {
                    remisy++;
                    System.out.println("W rundzie " + gry + ": mamy remis!");
                    System.out.println();
                }
            }
            while (wygrane < gramyDo && przegrane < gramyDo);

            System.out.println("Wszytkich losowań mieliśmy: " + gry + " razy.");
            if (wygrane > przegrane) {
                System.out.println(naImieP + " wygrałeś!");
            } else
                System.out.println("Ja wygrałem!");
            System.out.println();
            System.out.println("Wygrałeś " + wygrane + " razy.");
            System.out.println("Przegrałeś: " + przegrane + " razy.");
            System.out.println("Zremisowaliśmy " + remisy + " razy.");
            gry = 0;
            wygrane = 0;
            przegrane = 0;
            remisy = 0;
            System.out.print("Czy na pewno zakończyć grę? (gdy, tak = x,  n = nie)");
            graszPonownie = opcjaWyboru.nextLine();
            graszPonownie = opcjaWyboru.nextLine();
        } while (graszPonownie.equalsIgnoreCase("N"));
    }
}
