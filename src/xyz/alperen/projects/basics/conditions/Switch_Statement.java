package xyz.alperen.projects.basics.conditions;

import java.util.Random;

public class Switch_Statement {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 5 und 10

        // Wenn der Wert 10 ist gib aus Ten
        // Wenn der Wert 9 ist gib aus Nine
        // Wenn der Wert 8 ist gib aus Eight
        // etc.

        Random random = new Random();
        int randomNumber = random.nextInt(5, 11);


        switch (randomNumber) {
            case 10:
                System.out.println("Die Zufallszahl ist 10");
                break;

            case 9:
                System.out.println("Die Zufallszahl ist 9");
                break;

            case 8:
                System.out.println("Die Zufallszahl ist 8");
                break;

            case 7:
                System.out.println("Die Zufallszahl ist 7");
                break;

            case 6:
                System.out.println("Die Zufallszahl ist 6");
                break;

            case 5:
                System.out.println("Die Zufallszahl ist 5");
                break;


        }

    }
}
