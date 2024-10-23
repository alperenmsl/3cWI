package xyz.alperen.projects.basics;

import java.util.Random;
import java.util.Scanner;

public class Wurfelspiel_Beispiel {
    public static void main(String[] args) {
        // Erstelle ein Würfelspiel! Du spielst gegen den Computer.
        // Wenn das Spiel startet (mit einem kleinen Menü), hat der Spieler 6 Würfe.
        // Er spielt dabei gegen den Computer.
        // Wenn die Augensumme höher ist als jene des Computers hat der Spieler gewonnen,
        // ansonsten der Computer.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean isFinished = false;

        while (!isFinished){
            System.out.println("1. Möchten wir das Spiel beginnen? Ja?");
            System.out.println("2. Nein! Ich möchte das Spiel verlassen.");
            int selection = scanner.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Zahlen werden gewürfelt...");

                    int playerSum = 0;
                    int computerSum = 0;

                    //Ich & Computer würfelt 6 mal
                    for (int i = 0; i < 6; i++) {
                        int spielerWurf = random.nextInt(1, 7);
                        System.out.println("Du hast " + spielerWurf + " gewürfelt");
                        playerSum += spielerWurf;

                        int computerWurf = random.nextInt(1, 7);
                        System.out.println("Computer hat " + computerWurf + " gewürfelt");
                        computerSum += computerWurf;
                    }

                    System.out.println("\nDeine Gesamtsumme: " + playerSum);
                    System.out.println("Computer Gesamtsumme: " + computerSum);

                    if (playerSum > computerSum) {
                        System.out.println("Du hast Gewonnen");
                    } else if (playerSum < computerSum) {
                        System.out.println("Du hast Verloren! Spiele noch einmal");
                    } else {
                        System.out.println("Das spiel endet unentschieden");
                    }

                    break;

                case 2:
                    System.out.println("Danke für das spielen! Bis zum nächsten mal..");
                    isFinished = true;
                    break;

                default:
                    System.out.println("Ungültige auswahl! Wähle erneut.");

            }

        }

    }
}
