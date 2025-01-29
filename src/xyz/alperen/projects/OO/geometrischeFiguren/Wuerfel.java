package xyz.alperen.projects.OO.geometrischeFiguren;

public class Wuerfel extends GeometrischeFigur {
    private double kantenlaenge;

    public Wuerfel(String name, double kantenlaenge) {
        super(name);
        this.kantenlaenge = kantenlaenge;
    }

    public double getArea() {
        return 6 * kantenlaenge * kantenlaenge;
    }
}
