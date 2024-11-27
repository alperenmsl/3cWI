package xyz.alperen.projects.OO.definedVariables.newCar;
import xyz.alperen.projects.OO.definedVariables.newCar.Car;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(450, Engine.TYPE.BENZIN);
        Car myCar = new Car(e1, "BMW","M4 Competition", "B1234", "Schwarz", 15, 20);

        System.out.println("Marke: " + myCar.getBrand());
        System.out.println("Modell: "+ myCar.getModell());
        System.out.println("Seriennummer: " + myCar.getSerialNumber());
        System.out.println("Farbe: " + myCar.getColor());
        System.out.println("Tankkapazität: " + myCar.getFuelCapacity() + " Liter");
        System.out.println("Verbrauch: " + myCar.getFuelConsumption() + " L/100km");
        System.out.println("Verbleibende Reichweite: " + myCar.getRemainingRange() + " km");
        System.out.println("HorsePower: "+e1.getHorsePower());
        System.out.println("Kraftstoff: "+e1.getKraftstoff());

        myCar.drive(100);
        System.out.println("Verbleibender Tankinhalt: " + myCar.getFuelAmount() + " Liter");

        //D R Y
    }
}
