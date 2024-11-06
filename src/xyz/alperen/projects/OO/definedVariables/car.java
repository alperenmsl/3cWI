package xyz.alperen.projects.OO.definedVariables;

public class car {

    public int fuelAmount;
    public double fuelConsumption;
    public int fuelCapacity;
    public String brand;
    public String modell;
    public String serialNumber;
    public String color;



    public void turboBoost () {
        if (fuelAmount > (fuelCapacity * 0.10)) {
            System.out.println("Turbo Boost");
        } else {
            System.out.println("Not enough fuel to get a super Boost!");
        }
    }

    public void doBreak() {
        System.out.println("Ich bremse.");
    }

    public void honk (int amountOfRepetition){
        for (int i = 0; i < amountOfRepetition; i++) {
            System.out.println("Tuut");
        }
    }

    public double getRemainingRange() {
        return (fuelAmount / fuelConsumption) * 100;
    }


}
