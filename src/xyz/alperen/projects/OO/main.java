package xyz.alperen.projects.OO;
import xyz.alperen.projects.OO.definedVariables.car;


import java.util.Scanner;

//Wir bauen das erste Objekt. Ein Auto!
//Ein Auto hat Eigenschaften (Farbe, Spritverbrauch, Seriennummer) und Fähigkeiten (fahren, bremsen)
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        String brand = null;
        String modell = null;
        String color = null;

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
                    brand = scanner.nextLine();

                    System.out.println("Welches Modell von der Marke " + brand + " soll es sein: ");
                    modell = scanner.nextLine();

                    System.out.println("Welche Farbe soll das Auto haben: ");
                    color = scanner.nextLine();

                    System.out.println("\nAuto wurde erstellt -");
                    System.out.println("Brand: " + brand);
                    System.out.println("Modell: " + modell);
                    System.out.println("Color: " + color);
                    break;

                case 2:
                    if (brand == null || modell == null || color == null) {
                        System.out.println("Bitte erstelle zuerst ein Auto.");
                    } else {
                        System.out.println("Car Info -");
                        System.out.println("Brand: " + brand);
                        System.out.println("Modell: " + modell);
                        System.out.println("Color: " + color);
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


                case 5:
                    System.out.println("Danke für den Besuch!");
                    isFinished = true;
                    break;

                default:
                    System.out.println("Ungültige auswahl! Wähle erneut.");
                    break;
            }
        }




        //Füge eine Methode break() ein. Die Methode gibt den String "Ich bremse" aus.
        // Füge eine Methode turboBoost() ein. Diese Methode prüft ob der Benzinstand größer als 10% des Tankvolumens ist.
        // Wenn ja gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
        //
        //Füge eine Methode honk(int amountOfRepetitions) ein. Die Methode honk hupt
        // (gibt auf der Konsole den Text "Tuuut" aus. Über den Parameter amountOfRepetitions kann gesteuert werden wie oft gehupt wird.
        //
        //Füge eine Methode getRemainingRange() ein. Diese Methode liefert die Rest-Reichweite des Autos zurück.
        // Diese wird berechnet über den Tankstand und den Verbrauch.222




    }
}
