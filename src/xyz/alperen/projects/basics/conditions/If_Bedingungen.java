package xyz.alperen.projects.basics.conditions;

import java.util.Random;

public class If_Bedingungen {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100

        Random random = new Random();

        int randomNumber1 = random.nextInt(100);

        int randomNumber2 = random.nextInt(100);


        // Gib die Zufallszahl aus

        System.out.println("Zufallszahl: " + randomNumber1);

        // Wenn die Zahl kleiner ist, als 20 gib aus "Mini"
        if (randomNumber1 < 20) {
            System.out.println("Mini");
        }
        // Wenn die Zahl zw. 20 und 50 ist gib aus "Medium"
        if (randomNumber1 > 20 && randomNumber1 <= 50) {
            System.out.println("Medium");
        }
        // Wenn die Zahl größer als 50 ist, gib aus "Large"
        if (randomNumber1 > 50) {
            System.out.println("Large");
        }

        // Erstelle zwei Zufallszahlen zwischen 0 und 100

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

        System.out.println("Zufallszahl 1: " + randomNumber1);
        System.out.println("Zufallszahl 2: " + randomNumber2);

        if (randomNumber1 < randomNumber2 && randomNumber1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"

        if (randomNumber1 < 30 || randomNumber2 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50er"

        if (randomNumber1 < 50 && randomNumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50er");
        }


    }
}
