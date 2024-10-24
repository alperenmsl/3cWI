package xyz.alperen.projects.basics;

import java.util.Scanner;

public class WordGuesserV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "Alperen";
        char[] wordToGuess = word.toCharArray();
        char[] guessedWord = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            guessedWord[i] = '*';
        }


        boolean wordGuessed = false;
        int attemptsLeft = 5;

        while (!wordGuessed && attemptsLeft > 0) {
            System.out.println("Aktuelles Wort: ");
            printAray(guessedWord);
            System.out.println("\nRate einen Buchstaben: ");
            char guess = scanner.next().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < wordToGuess.length; i++) {
                if (wordToGuess[i] == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attemptsLeft--;
                System.out.println("Falsch. Verbleibende Versuche: " + attemptsLeft);
            }

            if (String.valueOf(guessedWord).equals(word)) {
                wordGuessed = true;
            }
        }

        if (wordGuessed) {
            System.out.println("Du hast das Wort richtig geraten: " + word + "!");
        } else {
            System.out.println("Leider verloren! Das Wort war: " + word);
        }

        scanner.close();
    }


    public static void printAray(char[] data){
        for (char c : data){
            System.out.print(c);
        }
    }
}
