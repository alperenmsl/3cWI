package arrays;

public class Arrays {
    public static void main(String[] args) {
        // Ein-dimensionales Array
        int[] throwsArray = new int[6];
        throwsArray[4] = 9;

        // Ausgabe des ein-dimensionalen Arrays
        for (int i = 0; i < throwsArray.length; i++) {
            System.out.print(throwsArray[i] + " ");
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
