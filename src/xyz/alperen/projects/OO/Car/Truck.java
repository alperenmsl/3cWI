package xyz.alperen.projects.OO.Car;

public class Truck extends Car{

    private String trailer;

    public Truck(Engine engine, String brand, String modell, String serialNumber, String color, int fuelConsumption, int fuelCapacity, String trailer) {
        super(engine, brand, modell, serialNumber, color, fuelConsumption, fuelCapacity);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
