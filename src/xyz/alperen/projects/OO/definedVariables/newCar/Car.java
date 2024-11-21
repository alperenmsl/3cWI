package xyz.alperen.projects.OO.definedVariables.newCar;

public class Car {
    // Instanzvariablen (private für Kapselung)
    private int fuelConsumption;
    private int fuelAmount;
    private int fuelCapacity;
    private String brand;
    private String modell;
    private String serialNumber;
    private String color;
    private Engine engine;

    public Car(Engine engine, String brand, String modell, String serialNumber, String color, int fuelConsumption, int fuelCapacity) {
        this.brand = brand;
        this.modell = modell;
        this.engine = engine;
        this.serialNumber = serialNumber;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
        this.fuelAmount = fuelCapacity; // Auto startet mit vollem Tank
    }

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

    // Methode: Fahren
    public void drive() {
        if (fuelAmount >= fuelConsumption) {
            fuelAmount -= fuelConsumption;
            System.out.println("I am driving");
        } else {
            System.out.println("Not enough fuel to drive");
        }
    }

    // Getter und Setter
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        if (fuelAmount > fuelCapacity) {
            this.fuelAmount = fuelCapacity;
        } else {
            this.fuelAmount = fuelAmount;
        }
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public String getModell() {
        return modell;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
