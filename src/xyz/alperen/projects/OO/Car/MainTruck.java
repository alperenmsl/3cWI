package xyz.alperen.projects.OO.Car;

public class MainTruck {
    public static void main(String[] args) {
        Engine e1 = new Engine(580, Engine.TYPE.BENZIN);

        Truck t1 = new Truck(e1, "MAN", "TGX", "M3786", "Black", 40, 400, "Water-Trailer");

        System.out.println("Truck Details -");
        System.out.println("Brand: "+t1.getBrand());
        System.out.println("Model: "+t1.getModell());
        System.out.println("Serial Number: "+t1.getSerialNumber());
        System.out.println("Color: "+t1.getColor());
        System.out.println("Fuel Consumption: "+t1.getFuelConsumption());
        System.out.println("Fuel Capacity: "+t1.getFuelCapacity());
        System.out.println("Trailer: "+t1.getTrailer());
        System.out.println("HorsePower: "+e1.getHorsePower());
        System.out.println("Kraftstoff: "+e1.getKraftstoff());
    }
}
