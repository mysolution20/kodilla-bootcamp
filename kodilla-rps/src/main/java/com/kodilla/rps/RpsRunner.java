package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        int won = 0, draws = 0, games = 0, opponent = 0, winner = 0, lost = 0;
        final int playerSwitch = 1, opponentSwitch = 2, drawSwitch = 3, stoneResult = 1, paperResult = 2, scissorsResult = 3;
        Scanner loneHardworkingScanner = new Scanner(System.in);
        System.out.print("Jak masz na imie?");
        String nameOfOpp = loneHardworkingScanner.next();
        System.out.print("Na imie masz: " + nameOfOpp + ", super!\n");
        String playAgain = "x";
        do {
            System.out.print("Podaj liczbe, do ilu zwyciestw gramy ?\n");
            int playUntil = loneHardworkingScanner.nextInt();        //
            System.out.print("Gramy do: " + playUntil + " wygranych.\n");
            do {
                opponent = (int) (Math.random() * 3) + 1;
                int player;
                do {
                    System.out.print("Losuj jeden z trzech, gdzie: " + "1 = kamień" + ",2 = papier" + ",3 = nożyce.\n");
                    player = loneHardworkingScanner.nextInt();
                    if (!(player == 1 || player == 2 || player == 3)) {
                        System.out.print(nameOfOpp + " wybrałeś: " + player + " to wartość z poza zakresu. Próbuj ponownie.\n");
                    }
                } while (!(player > 0 && player < 4));
                System.out.print(nameOfOpp + " wybrałeś: " + player);
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
                        break;
                }
                games++;
                if (winner == playerSwitch) {
                    won++;
                    System.out.println("W rundzie " + games + " wygrałeś: " + nameOfOpp + "!");
                } else if (winner == opponentSwitch) {
                    lost++;
                    System.out.println("W rundzie " + games + ": ja wygrałem !");
                } else {
                    draws++;
                    System.out.println("W rundzie " + games + ": mamy remis!\n");
                }
            }
            while (won < playUntil && lost < playUntil);
            System.out.println("*******************************************\n" +
                    "Wszytkich losowań mieliśmy: " + games + " razy.\n" +
                    "*******************************************");
            if (won > lost) {
                System.out.println(nameOfOpp + " wygrałeś!");
            } else
                System.out.println("Ja wygrałem!");
            System.out.println("Wygrałeś " + won + " razy.");
            System.out.println("Przegrałeś: " + lost + " razy.");
            System.out.println("Zremisowaliśmy " + draws + " razy.\n");
            games = 0;
            won = 0;
            lost = 0;
            draws = 0;
            System.out.print("Czy na pewno zakończyć grę? (gdy, tak = x,  n = nie).");
            playAgain = loneHardworkingScanner.nextLine();
            playAgain = loneHardworkingScanner.nextLine();
        } while (playAgain.equalsIgnoreCase("N"));
    }
}