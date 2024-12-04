package xyz.alperen.projects.OO.definedVariables.newCar;

public class Battery {
    private double chargeLevel;

    public Battery(double initialCharge) {
        if (initialCharge < 0) {
            this.chargeLevel = 0;
        } else if (initialCharge > 100) {
            this.chargeLevel = 100;
        } else {
            this.chargeLevel = initialCharge;
        }
    }

    public void consume(double amount) {
        if (chargeLevel - amount < 0) {
            chargeLevel = 0;
        } else {
            chargeLevel -= amount;
        }
        System.out.println("Verbraucher angeschlossen. Aktueller Ladestatus: " + chargeLevel + "%");
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public void disconnect() {
        System.out.println("Kein Verbraucher angeschlossen.");
    }
}
