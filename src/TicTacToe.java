import java.util.Scanner;

// CHATGPT BEISPIEL!!! NICHT SELBER GEMACHT!

public class TicTacToe {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean gameOver = false;
        char currentPlayer = 'X';

        while (!gameOver) {
            printBoard();
            playerMove(currentPlayer);
            gameOver = checkWin(currentPlayer) || checkDraw();

            // Wechsel des Spielers
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        printBoard();
        if (checkWin(currentPlayer == 'X' ? 'O' : 'X')) {
            System.out.println("Spieler " + (currentPlayer == 'X' ? 'O' : 'X') + " gewinnt!");
        } else {
            System.out.println("Unentschieden!");
        }
    }

    // Zeigt das Spielfeld an
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Abfrage der Spielereingabe
    public static void playerMove(char symbol) {
        int row, col;

        while (true) {
            System.out.println("Spieler " + symbol + ", wähle eine Position (Zeile und Spalte 0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = symbol;
                break;
            } else {
                System.out.println("Ungültiger Zug, versuche es erneut.");
            }
        }
    }

    // Prüfen, ob jemand gewonnen hat
    public static boolean checkWin(char symbol) {
        // Überprüfe Reihen, Spalten und Diagonalen
        return (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) || // 1. Reihe
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) || // 2. Reihe
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) || // 3. Reihe
                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) || // 1. Spalte
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) || // 2. Spalte
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) || // 3. Spalte
                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) || // Diagonale 1
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);   // Diagonale 2
    }

    // Prüfen, ob das Spiel unentschieden ist
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
