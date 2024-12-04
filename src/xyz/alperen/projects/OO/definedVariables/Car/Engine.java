package xyz.alperen.projects.OO.definedVariables.Car;

public class Engine {
    public enum TYPE {DIESEL, BENZIN, ELEKTRO}
    private int horsePower;
    private TYPE kraftstoff;

    public Engine(int horsePower, TYPE kraftstoff) {
        this.horsePower = horsePower;
        this.kraftstoff = kraftstoff;
    }

    public void drive(int amount){
        System.out.println("The motor is running with "+amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getKraftstoff() {
        return kraftstoff;
    }

}
