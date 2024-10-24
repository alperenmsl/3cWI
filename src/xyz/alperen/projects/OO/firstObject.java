package xyz.alperen.projects.OO;

import xyz.alperen.projects.OO.definedVariables.car;

//Wir bauen das erste Objekt. Ein Auto!
//Ein Auto hat Eigenschaften (Farbe, Spritverbrauch, Seriennummer) und Fähigkeiten (fahren, bremsen)
public class firstObject {
    public static void main(String[] args) {

        car c1 = new car();
        c1.brand = "Mercedes Benz";
        c1.modell = "CLS 63 AMG";
        c1.serialNumber = "M3726";
        c1.color = "Red";
        c1.fuelAmount = 5;
        c1.fuelCapacity = 50;
        c1.fuelConsumption = 4.5;

        car c2 = new car();
        c2.brand = "Bmw";
        c2.modell = "M8 Competition";
        c2.serialNumber = "B8327";
        c2.color = "Black";
        c2.fuelAmount = 3;
        c2.fuelCapacity = 40;
        c2.fuelConsumption = 3.8;


        System.out.println("Brand: " + c1.brand);
        System.out.println("Modell: " + c1.modell);
        System.out.println("Serial Number: " + c1.serialNumber);
        System.out.println("Color: " + c1.color);
        System.out.println("Fuel: " + c1.fuelAmount);
        System.out.println("\n");
        System.out.println("Brand: " + c2.brand);
        System.out.println("Modell: " + c2.modell);
        System.out.println("Serial Number: " + c2.serialNumber);
        System.out.println("Color: " + c2.color);
        System.out.println("Fuel: " + c2.fuelAmount);

        //Füge eine Methode break() ein. Die Methode gibt den String "Ich bremse" aus.
        // Füge eine Methode turboBoost() ein. Diese Methode prüft ob der Benzinstand größer als 10% des Tankvolumens ist.
        // Wenn ja gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
        //
        //Füge eine Methode honk(int amountOfRepetitions) ein. Die Methode honk hupt
        // (gibt auf der Konsole den Text "Tuuut" aus. Über den Parameter amountOfRepetitions kann gesteuert werden wie oft gehupt wird.
        //
        //Füge eine Methode getRemainingRange() ein. Diese Methode liefert die Rest-Reichweite des Autos zurück.
        // Diese wird berechnet über den Tankstand und den Verbrauch.



    }
}
