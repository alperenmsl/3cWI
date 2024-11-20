package xyz.alperen.projects.OO.definedVariables.newCar;
import xyz.alperen.projects.OO.definedVariables.newCar.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setFuelAmount(70);
        c1.setBrand("Audi");
        c1.setFuelConsumption(7);
        c1.setSerialNumber("A1234");


        Car c2 = new Car();
        c2.setFuelAmount(20);
        c2.setBrand("Mercedes");
        c2.setFuelConsumption(6);
        c2.setSerialNumber("M1234");

        System.out.println(c2.getFuelAmount());
        c2.drive();
        System.out.println(c2.getFuelAmount());
        c1.turboBoost();
        c1.honk(2);

        //D R Y
    }
}
