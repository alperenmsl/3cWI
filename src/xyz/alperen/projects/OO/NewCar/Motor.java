package xyz.alperen.projects.OO.NewCar;

public class Motor {
    private String type; // Diesel oder Benzin
    private int power;   // in PS

    public Motor(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }
}
