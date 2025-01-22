package xyz.alperen.projects.UebungenTest;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Honda","Civic","green",4,70);


        System.out.println("Car Brand: " + c1.Brand);
        System.out.println("Car Model: " + c1.Model);
        System.out.println("Car Color: " + c1.color);
        System.out.println("Car Fuel Amount: " + c1.fuelAmount);
        c1.drive();
        c1.doBreak();
        c1.turboBoost();
        c1.honk(2);



    }
}
