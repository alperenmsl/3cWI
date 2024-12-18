package xyz.alperen.projects.OO.Car;

public class MainSuper {
    public static void main(String[] args) {
        Engine e1 = new Engine(600, Engine.TYPE.BENZIN);

        Super s1 = new Super(e1, "Aston Martin", "DBS Superleggera", "S1254", "Titan Grey", 15, 50, 390);

        System.out.println("Super Car Details -");
        System.out.println("Brand: "+s1.getBrand());
        System.out.println("Model: "+s1.getModell());
        System.out.println("Serial Number: "+s1.getSerialNumber());
        System.out.println("Color: "+s1.getColor());
        System.out.println("Fuel Consumption: "+s1.getFuelConsumption());
        System.out.println("Fuel Capacity: "+s1.getFuelCapacity());
        System.out.println("vMax: "+s1.getSpeed());
        System.out.println("HorsePower: "+e1.getHorsePower());
        System.out.println("Kraftstoff: "+e1.getKraftstoff());
    }
}
