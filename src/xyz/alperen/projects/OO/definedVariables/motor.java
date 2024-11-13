package xyz.alperen.projects.OO.definedVariables;

public class motor {
    public int fuelAmount;
    public double fuelConsumption;
    public int fuelCapacity;

    public motor() {
        this.fuelAmount = 100;
        this.fuelCapacity = 50;
        this.fuelConsumption = 5.0;
    }

    public void turboBoost() {
        if (fuelAmount > (fuelCapacity * 0.10)) {
            System.out.println("Turbo Boost activated");
        } else {
            System.out.println("Not enough fuel to get a super Boost!");
        }
    }

    public double getRemainingRange() {
        return (fuelAmount / fuelConsumption) * 100;
    }
}
