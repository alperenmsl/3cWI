import java.util.Scanner;

public class WordGuesser {
    public static void main(String[] args) {
        // Word guesser = Wörter erraten zbs. H*ll* = Hallo
        // If schleife -> If word = Hallo gibt correct aus. Wenn nicht dann false.

        Scanner scanner = new Scanner(System.in);
        String word = "";
        boolean isFinished = false;

        while (!isFinished) {
            System.out.println("Gues the word H**l*");
            word = scanner.next();

            if (word.equals("Hallo")) {
                System.out.println("You guess the correct! It was " + word);
                isFinished = true;
            } else {
                System.out.println("You didn't guess the word right please try it again.");
            }
        }
    }
}
