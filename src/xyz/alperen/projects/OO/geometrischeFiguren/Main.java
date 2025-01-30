package xyz.alperen.projects.OO.geometrischeFiguren;

public class Main {
    public static void main(String[] args) {
        GeometrischeFigur g1 = new Kreis("Geometrische Figuren 1", 2);
        GeometrischeFigur g2 = new VierEck("Geometrische Figuren 2", 4, 6);
        GeometrischeFigur g3 = new Wuerfel("Geometrische Figuren 3", 5);

        System.out.println("Fläche of Kreis: " + g1.getArea());
        System.out.println("Fläche of VierEck: " + g2.getArea());
        System.out.println("Fläche of Wuerfel: " + g3.getArea());
    }
}
