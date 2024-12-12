package xyz.alperen.projects.OO.Lamp;

public class Main {
    public static void main(String[] args) {
        Light light1 = new Light("AA123", "White", 10);
        Light light2 = new Light("BB234", "Blue", 15);


        System.out.println("Licht "+light1.getName()+" -");
        System.out.println("Farbe: "+light1.getColor());
        System.out.println("Stromverbrauch: "+light1.getPowerConsumption()+" Watt");


        System.out.println("\nLicht "+light2.getName()+" -");
        System.out.println("Farbe: "+light2.getColor());
        System.out.println("Stromverbrauch: "+light2.getPowerConsumption()+" Watt");



        Lamp lamp = new Lamp();
        lamp.addLightElement(light1);
        lamp.addLightElement(light2);

        System.out.println("\nNamen aller Lichtelemente: ");
        lamp.printNamesOfLightElements();

        lamp.turnAllOn();

        System.out.println("Gesammt verbrauchte Energie: " + lamp.getOverallPowerUsage()+ " Watt");

    }
}
