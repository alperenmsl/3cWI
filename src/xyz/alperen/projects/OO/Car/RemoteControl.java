package xyz.alperen.projects.OO.Car;

public class RemoteControl {
    private Battery battery1;
    private Battery battery2;

    public RemoteControl(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public double getStatus() {
        double averageCharge = (battery1.getChargeLevel() + battery2.getChargeLevel()) / 2;
        System.out.println("Durchschnittlicher Ladestatus: " + averageCharge + "%");
        return averageCharge;
    }

    public void turnOn() {
        battery1.consume(5);
        battery2.consume(5);
    }

    public void turnOff() {
        battery1.disconnect();
        battery2.disconnect();
    }
}
