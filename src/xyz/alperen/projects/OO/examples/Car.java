package xyz.alperen.projects.OO.examples;

public class Car {
    private String color;
    private int maxSpeed;
    private double basePrice;
    private double baseConsumption; // Verbrauch in l/100km
    private Manufacturer manufacturer;
    private Motor motor;

    public Car(String color, int maxSpeed, double basePrice, double baseConsumption, Manufacturer manufacturer, Motor motor) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.manufacturer = manufacturer;
        this.motor = motor;
    }

    public double calculatePrice() {
        double discountAmount = basePrice * (manufacturer.getDiscount() / 100);
        return basePrice - discountAmount;
    }

    public double calculateConsumption(int mileage) {
        if (mileage <= 50000) {
            return baseConsumption;
        } else {
            return baseConsumption * 1.098; // Verbrauch um 9.8% höher
        }
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Motor getMotor() {
        return motor;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
