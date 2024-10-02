import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo Alperen! Wollen wir Tic Tac Toe Spielen?");

        while (!isFinished) {
            System.out.println("1. Ja");
            System.out.println("2. Nein");
            System.out.println("\n---------------------------------");
            int selection = scanner.nextInt();

            switch (selection){
                case 1:
                    System.out.println("Alles Klar! Spiel wird gestartet!");

                    break;

                case 2:
                    System.out.println("Danke für das spielen!");
                    isFinished = true;
                    break;

                default:
                    System.out.println("Ungültige auswahl!");
                    break;
            }


        }

        System.out.println("\n---------------------------------");

        // Zwei-dimensionales Array
        int[][] playGround = new int[3][3];
        playGround[0][0] = 1;
        playGround[2][1] = 2;

        // Ausgabe des zwei-dimensionalen Arrays
        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround[row].length; col++) {
                System.out.print(playGround[row][col] + " ");  // Verwende print() statt println()
            }
            System.out.println();  // Neue Zeile nach jeder Reihe
        }
    }
}
