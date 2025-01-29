package xyz.alperen.projects.OO.geometrischeFiguren;

public class VierEck extends GeometrischeFigur {
    private double breite;
    private double hoehe;

    public VierEck(String name, double breite, double hoehe) {
        super(name);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getArea() {
        return breite * hoehe;
    }
}
