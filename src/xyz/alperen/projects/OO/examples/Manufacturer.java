package xyz.alperen.projects.OO.examples;

public class Manufacturer {
    private String name;
    private String modell;
    private String country;
    private double discount; // in Prozent

    public Manufacturer(String name, String modell, String country, double discount) {
        this.name = name;
        this.modell = modell;
        this.country = country;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getModell() {
        return modell;
    }

    public String getCountry() {
        return country;
    }

    public double getDiscount() {
        return discount;
    }
}
