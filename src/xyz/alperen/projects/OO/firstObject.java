package xyz.alperen.projects.OO;

import xyz.alperen.projects.OO.definedVariables.car;

//Wir bauen das erste Objekt. Ein Auto!
//Ein Auto hat Eigenschaften (Farbe, Spritverbrauch, Seriennummer) und Fähigkeiten (fahren, bremsen)
public class firstObject {
    public static void main(String[] args) {

    car c1 = new car();
    c1.brand = "Mercedes Benz";
    c1.modell = "CLS 63 AMG";
    c1.serialNumber ="M3726";
    c1.color = "Red";
    c1.fuel = 5;

    car c2 = new car();
    c2.brand  = "Bmw";
    c2.modell = "M8 Competition";
    c2.serialNumber = "B8327";
    c2.color = "Black";
    c2.fuel = 3;

        System.out.println("Brand: "+c1.brand);
        System.out.println("Modell: "+c1.modell);
        System.out.println("Serial Number: "+c1.serialNumber);
        System.out.println("Color: "+c1.color);
        System.out.println("Fuel: "+c1.fuel);
        System.out.println("\n");
        System.out.println("Brand: "+c2.brand);
        System.out.println("Modell: "+c2.modell);
        System.out.println("Serial Number: "+c2.serialNumber);
        System.out.println("Color: "+c2.color);
        System.out.println("Fuel: "+c2.fuel);


    }
}
