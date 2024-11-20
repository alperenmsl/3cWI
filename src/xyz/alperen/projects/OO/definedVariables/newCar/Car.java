package xyz.alperen.projects.OO.definedVariables.newCar;



public class Car {
    // Instanzvariablen
    private int fuelConsumption;
    private int fuelAmount;
    private int fuelCapacity;
    private String brand;
    private String serialNumber;
    private String color;

    // Methode: Bremsen
    public void doBreak() {
        System.out.println("Ich bremse");
    }

    // Methode: Turbo-Boost
    public void turboBoost() {
        if (fuelAmount > (fuelCapacity * 0.10)) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    // Methode: Hupen
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    // Methode: Restreichweite berechnen
    public double getRemainingRange() {
        return (fuelAmount / (double) fuelConsumption) * 100; // Reichweite in km
    }

    // Methode: Fahren (zum Testen)
    public void drive() {
        if (fuelAmount > fuelConsumption) {
            fuelAmount -= fuelConsumption;
            System.out.println("I am driving");
        } else {
            System.out.println("Not enough fuel to drive");
        }
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > 100) {
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }


}
