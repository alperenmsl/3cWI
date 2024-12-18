package xyz.alperen.projects.OO.Car;

public class Super extends Car{

    private int speed;

    public Super(Engine engine, String brand, String modell, String serialNumber, String color, int fuelConsumption, int fuelCapacity, int speed) {
        super(engine, brand, modell, serialNumber, color, fuelConsumption, fuelCapacity);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
