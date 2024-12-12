package xyz.alperen.projects.OO.NewCar;

public class Main {
    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("Audi", "A7 - Rs7 Optik", "Deutschland", 10.0);
        Motor motor = new Motor("Benzin", 480);

        Car car = new Car("Nardo-Grau", 380, 30000.0, 6.5, manufacturer, motor);

        System.out.println("Hersteller Details -");
        System.out.println("Auto Hersteller: "+manufacturer.getName());
        System.out.println("Hersteller Herkunft: "+manufacturer.getCountry());
        System.out.println("Auto Modell: "+manufacturer.getModell());
        System.out.println("Auto Farbe: "+car.getColor());

        System.out.println("\n");
        System.out.println("Motor Details -");
        System.out.println("Kraftstoff: "+motor.getType());
        System.out.println("Leistung: "+motor.getPower());

        double endPrice = car.calculatePrice();
        System.out.println("Aktueller Preis vom " + manufacturer.getModell() + " beträgt " + car.getBasePrice() + " €");
        System.out.println("Der Preis vom " + manufacturer.getModell() + " beträgt nach dem Rabatt : " + endPrice + " €");

        int kilometers = 60000;
        double consumption = car.calculateConsumption(kilometers);
        System.out.println("Der Verbrauch des Autos bei " + kilometers + " km beträgt: " + consumption + " l/100km");
    }
}

