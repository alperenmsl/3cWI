package xyz.alperen.projects.OO.Car;

import java.util.ArrayList;
import java.util.List;

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
    private List<RearMirror> mirrors;
    private List<Tires> tires = new ArrayList<>();




    public Car(Engine engine, String brand, String modell, String serialNumber, String color, int fuelConsumption, int fuelCapacity) {
        this.brand = brand;
        this.modell = modell;
        this.engine = engine;
        this.serialNumber = serialNumber;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        this.fuelCapacity = fuelCapacity;
        this.fuelAmount = fuelCapacity; // Auto startet mit vollem Tank
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void printTires() {
        if (tires.isEmpty()) {
            System.out.println("Das Auto hat keine Reifen.");
        } else {
            System.out.println("Reifen am Auto:");
            for (Tires tire : tires) {
                System.out.println("Zoll: " + tire.getZoll() +
                        ", Typ: " + tire.getTyp() +
                        ", Profiltiefe: " + tire.getProfilTiefe() + " mm" +
                        ", Luftdruck: " + tire.getLuftdruck() + " bar");
            }
        }
    }

    public List<Tires> getTires() {
        return tires;
    }


    public void addTires(Tires tire) {
        this.tires.add(tire);
    }


    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public void drive(int speed) {
        if (speed < 1 || speed > 100) {
            System.out.println("Ungültige Geschwindigkeit! Geschwindigkeit muss zwischen 1 und 100 sein.");
            return;
        }

        engine.drive(speed);

        int fuelConsumptionAtSpeed = (int) Math.ceil(fuelConsumption * (speed / 50.0));

        if (fuelAmount >= fuelConsumptionAtSpeed) {
            fuelAmount -= fuelConsumptionAtSpeed;
            System.out.println("Fahre mit einer Geschwindigkeit von: " + speed + " km/h. Verbleibender Tank: " + fuelAmount + "L");
        } else {
            System.out.println("Nicht genügend Tank um mit einer Geschwindigkeit von: " + speed + " km/h zu fahren.");
        }

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


    public List<RearMirror> getMirrors() {
        return mirrors;
    }

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
