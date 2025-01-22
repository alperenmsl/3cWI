package xyz.alperen.projects.UebungenTest;


public class Car {
    public String Brand;
    public String Model;
    public String color;
    public int fuelConsumption;
    public int fuelAmount;
    public int fuelCapacity;

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I Started Driving. Current Fuel Amount: " + this.fuelAmount);
    }

    public Car(String brand, String model, String color, int fuelConsumption, int fuelAmount) {
        this.Brand = brand;
        this.Model = model;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
    }

    //Füge eine Methode doBreak() ein. Die Methode gibt den String "Ich bremse" aus.
    public void doBreak() {
        System.out.println("I step on the break.");
    }

    // Füge eine Methode turboBoost() ein. Diese Methode prüft, ob der Benzinstand größer als 10% des Tankvolumens ist.
    // Wenn ja, gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
    public void turboBoost() {
        if (this.fuelAmount > (fuelCapacity * 0.10)) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to SuperBoost");
        }
    }


    // Füge eine Methode honk(int amountOfRepetitions) ein. Die Methode honk hupt und gibt auf der Konsole den Text "Tuuut" aus.
    // Über den Parameter amountOfRepetitions kann gesteuert werden wie oft gehupt wird.
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuut");
        }
    }

    // Füge eine Methode getRemainingRange() ein. Diese Methode liefert die Rest-Reichweite des Autos zurück.
    // Diese wird berechnet über den Tankstand und den Verbrauch.

    public double getRemainingRange() {
        return (fuelAmount / (double) fuelConsumption) * 100;
    }
}
