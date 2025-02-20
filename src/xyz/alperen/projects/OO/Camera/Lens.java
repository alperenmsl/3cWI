package xyz.alperen.projects.OO.Camera;

public class Lens {
    private Manufacturer manufacturer;
    private int focalLength;

    public Lens(Manufacturer manufacturer, int focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Lens by " + manufacturer + ", " + focalLength + "mm";
    }
}
