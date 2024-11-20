package xyz.alperen.projects.OO.definedVariables.newCar;
import xyz.alperen.projects.OO.definedVariables.newCar.Car;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "B1234", "Schwarz", 8, 50);


        System.out.println("Marke: " + myCar.getBrand());
        System.out.println("Seriennummer: " + myCar.getSerialNumber());
        System.out.println("Farbe: " + myCar.getColor());
        System.out.println("Tankkapazität: " + myCar.getFuelCapacity() + " Liter");
        System.out.println("Verbrauch: " + myCar.getFuelConsumption() + " L/100km");
        System.out.println("Verbleibende Reichweite: " + myCar.getRemainingRange() + " km");

        myCar.drive();
        System.out.println("Verbleibender Tankinhalt: " + myCar.getFuelAmount() + " Liter");

        //D R Y
    }
}
