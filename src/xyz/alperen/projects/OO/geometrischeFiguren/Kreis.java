package xyz.alperen.projects.OO.geometrischeFiguren;

public class Kreis extends GeometrischeFigur {
    private double radius;

    public Kreis(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius; // Weil formel für Kreis ist Pi * radius² (Deshalb Radius * Radius)
    }
}

