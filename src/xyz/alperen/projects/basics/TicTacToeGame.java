package xyz.alperen.projects.basics;

import java.util.Scanner;

public class TicTacToeGame {
    static int[][] field = new int[3][3]; // Spielfeld
    static Scanner scanner = new Scanner(System.in);
    static boolean isPlayer1 = true; // Spieler 1 beginnt

    public static void main(String[] args) {

        boolean isFinished = false;
        System.out.println("Hallo Alperen! Wollen wir Tic Tac Toe spielen?");

        // Auswahl, ob das Spiel gestartet werden soll
        while (!isFinished) {
            System.out.println("1. Ja");
            System.out.println("2. Nein");
            System.out.println("\n---------------------------------");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Alles klar! Spiel wird gestartet!");

                    while (!isFinished) { // Das Spiel läuft, bis man es beendet
                        if (isPlayer1) {
                            System.out.println("Player 1 (X), bitte Koordinaten eingeben (z.B. 0,1):");
                        } else {
                            System.out.println("Player 2 (O), bitte Koordinaten eingeben (z.B. 0,1):");
                        }

                        String inputOfPlayer = scanner.next(); // Eingabe des Spielers
                        String[] input = inputOfPlayer.split(","); // Koordinaten aufteilen
                        int input1 = Integer.parseInt(input[0]); // Erste Zahl (Reihe)
                        int input2 = Integer.parseInt(input[1]); // Zweite Zahl (Spalte)

                        if (field[input1][input2] == 0) { // Prüfen, ob das Feld frei ist
                            field[input1][input2] = isPlayer1 ? 1 : 2; // 1 für Spieler 1, 2 für Spieler 2
                            System.out.println("Zug auf: " + input1 + "-" + input2);

                            isPlayer1 = !isPlayer1; // Spieler wechseln
                        } else {
                            System.out.println("Das Feld ist schon besetzt! Wähle ein anderes.");
                        }
                    }

                    break;

                case 2:
                    System.out.println("Danke für das Spielen!");
                    isFinished = true;
                    break;

                default:
                    System.out.println("Ungültige Auswahl!");
                    break;
            }
        }
    }
}
