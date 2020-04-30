package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
            int won = 0, draws = 0, games = 0, opponent = 0, winner = 0, lost = 0;
            final int playerSwitch = 1, opponentSwitch = 2, drawSwitch = 3, stoneResult = 1, paperResult = 2, scissorsResult = 3;
            Scanner loneHardworkingScanner = new Scanner(System.in);
            System.out.print("Jak masz na imie?");
            String nameOfOpp = loneHardworkingScanner.next();             //        String nameOfOpp = "Andrzej";
            System.out.print("Na imie masz: " + nameOfOpp + ", super!");
            System.out.print("\n");
            String playAgain = "x";
        do {
            System.out.print("Podaj liczbe, do ilu zwycienstw gramy ?");
            System.out.print("\n");
            int playUntil = loneHardworkingScanner.nextInt();        //            int playUntil = 2;
            System.out.print("Gramy do: " + playUntil + " wygranych.");
            System.out.print("\n");
            do {
                opponent = (int) (Math.random() * 3) + 1;
                System.out.print("Losuj jeden z trzech, gdzie: " + "1 = kamień" + ",2 = papier" + ",3 = nożyce");
                int player = loneHardworkingScanner.nextInt();
                System.out.print(nameOfOpp + " wybrałeś:");
                switch (player) {
                    case stoneResult:
                        System.out.println(" kamień");
                        break;
                    case paperResult:
                        System.out.println(" papier");
                        break;
                    case scissorsResult:
                        System.out.println(" nożyce");
                        break;
                }
                System.out.print("Ja wybrałem:");
                switch (opponent) {
                    case stoneResult:
                        System.out.println(" kamień");
                        if (player == scissorsResult) {
                            winner = opponentSwitch;
                        } else if (player == paperResult) {
                            winner = playerSwitch;
                        } else {
                            winner = drawSwitch;
                        }
                        break;
                    case paperResult:
                        System.out.println(" papier");
                        if (player == stoneResult) {
                            winner = opponentSwitch;
                        } else if (player == scissorsResult) {
                            winner = playerSwitch;
                        } else {
                            winner = drawSwitch;
                        }
                        break;
                    case scissorsResult:
                        System.out.println(" nożyce");
                        if (player == paperResult) {
                            winner = opponentSwitch;
                        } else if (player == stoneResult) {
                            winner = playerSwitch;
                        } else {
                            winner = drawSwitch;
                        }
                }
                games++;
                if (winner == playerSwitch) {
                    won++;
                    System.out.println("W rundzie " + games + " wygrałeś: " + nameOfOpp + "!");
                    System.out.println("\n");
                } else if (winner == opponentSwitch) {
                    lost++;
                    System.out.println("W rundzie " + games + ": ja wygrałem !");
                    System.out.println("\n");
                } else {
                    draws++;
                    System.out.println("W rundzie " + games + ": mamy remis!");
                    System.out.println("\n");
                }
            }
            while (won < playUntil && lost < playUntil);
            System.out.println("Wszytkich losowań mieliśmy: " + games + " razy.");
            if (won > lost) {
                System.out.println(nameOfOpp + " wygrałeś!");
            } else
                System.out.println("Ja wygrałem!");
                System.out.println("\n");
                System.out.println("Wygrałeś " + won + " razy.");
                System.out.println("Przegrałeś: " + lost + " razy.");
                System.out.println("Zremisowaliśmy " + draws + " razy.");
                games = 0;
                won = 0;
                lost = 0;
                draws = 0;
                System.out.print("Czy na pewno zakończyć grę? (gdy, tak = x,  n = nie)");
                playAgain = loneHardworkingScanner.nextLine();
                playAgain = loneHardworkingScanner.nextLine();
        } while (playAgain.equalsIgnoreCase("N"));
    }
}
