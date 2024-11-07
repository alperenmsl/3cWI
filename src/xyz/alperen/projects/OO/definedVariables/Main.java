package xyz.alperen.projects.OO;

import xyz.alperen.projects.OO.definedVariables.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        Car car = null;

        while (!isFinished) {
            System.out.println("1. New Car");
            System.out.println("2. Car Info");
            System.out.println("3. Hoonk");
            System.out.println("4. Engine Info");
            System.out.println("5. Quit");

            int section = Integer.parseInt(scanner.nextLine());

            switch (section) {
                case 1:
                    System.out.println("Welche Marke soll das Auto haben: ");
                    String brand = scanner.nextLine();

                    System.out.println("Welches Modell von der Marke " + brand + " soll es sein: ");
                    String modell = scanner.nextLine();

                    System.out.println("Welche Farbe soll das Auto haben: ");
                    String color = scanner.nextLine();

                    car = new Car(brand, modell, color);

                    System.out.println("\nAuto wurde erstellt -");
                    System.out.println("Brand: " + car.brand);
                    System.out.println("Modell: " + car.modell);
                    System.out.println("Color: " + car.color);
                    break;

                case 2:
                    if (car == null) {
                        System.out.println("Bitte erstelle zuerst ein Auto.");
                    } else {
                        System.out.println("Car Info -");
                        System.out.println("Brand: " + car.brand);
                        System.out.println("Modell: " + car.modell);
                        System.out.println("Color: " + car.color);
                    }
                    break;

                case 3:
                    if (car == null) {
                        System.out.println("Bitte erstelle zuerst ein Auto.");
                    } else {
                        System.out.println("Wie oft möchtest du hupen?");
                        int repetitions = Integer.parseInt(scanner.nextLine());
                        car.honk(repetitions);
                    }
                    break;

                case 4:
                    if (car == null) {
                        System.out.println("Bitte erstelle zuerst ein Auto.");
                    } else {
                        System.out.println("Motorinformationen:");
                        car.turboBoost();
                        System.out.println("Verbleibende Reichweite: " + car.getRemainingRange() + " km");
                    }
                    break;


                case 5:
                    System.out.println("Danke für den Besuch!");
                    isFinished = true;
                    break;

                default:
                    System.out.println("Ungültige Auswahl! Wähle erneut.");
                    break;
            }
        }

        scanner.close();
    }
}
