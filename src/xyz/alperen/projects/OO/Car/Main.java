package xyz.alperen.projects.OO.Car;

public class Main {
    public static void main(String[] args) {
        RearMirror r1 = new RearMirror(100, 0);
        RearMirror r2 = new RearMirror(90, -40);

        Engine e1 = new Engine(450, Engine.TYPE.BENZIN);

        Car myCar = new Car(e1, "BMW","M4 Competition", "B1234", "Schwarz", 15, 20);
        myCar.addMirror(r1);
        myCar.addMirror(r2);

        // Battery 1 und Battery 2
        Battery battery1 = new Battery(80);
        Battery battery2 = new Battery(60);

        // Erstellen der Fernbedienung mit den zwei Batterien
        RemoteControl remote = new RemoteControl(battery1, battery2);

        // Reifen erstellen und hinzufügen
        Tires tire1 = new Tires(20,"Winter", 1.7, 2.5);
        Tires tire2 = new Tires(20,"Winter", 1.7, 2.5);
        Tires tire3 = new Tires(20,"Winter", 1.7, 2.8);
        Tires tire4 = new Tires(20,"Winter", 1.7, 2.8);

        myCar.addTires(tire1);
        myCar.addTires(tire2);
        myCar.addTires(tire3);
        myCar.addTires(tire4);

        System.out.println("Marke: " + myCar.getBrand());
        System.out.println("Modell: "+ myCar.getModell());
        System.out.println("Seriennummer: " + myCar.getSerialNumber());
        System.out.println("Farbe: " + myCar.getColor());
        System.out.println("Tankkapazität: " + myCar.getFuelCapacity() + " Liter");
        System.out.println("Verbrauch: " + myCar.getFuelConsumption() + " L/100km");
        System.out.println("Verbleibende Reichweite: " + myCar.getRemainingRange() + " km");
        System.out.println("HorsePower: "+e1.getHorsePower());
        System.out.println("Kraftstoff: "+e1.getKraftstoff());
        System.out.println("Mirror 2 Size: "+myCar.getMirrors().get(1).getSize());
        System.out.println("Mirror 2 Position: "+myCar.getMirrors().get(1).getPosition());

        myCar.drive(100);
        System.out.println("Verbleibender Tankinhalt: " + myCar.getFuelAmount() + " Liter");

        myCar.printTires();

        System.out.println("\n");

        // Abfrage des Ladestatus
        remote.getStatus();

        // Einschalten der Fernbedienung
        remote.turnOn();

        // Abfrage des Ladestatus nach Nutzung
        remote.getStatus();

        // Ausschalten der Fernbedienung
        remote.turnOff();

        //D R Y
    }
}
