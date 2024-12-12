package xyz.alperen.projects.OO.Lamp;

import java.util.ArrayList;
import java.util.List;

public class Light {
    private boolean isOn;
    private String name;
    private String color;
    private double powerConsumption;

    public Light(String name, String color, double powerConsumption) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("Hallo! Mein Name ist " + name + " und ich bin schon an.");
        } else {
            isOn = true;
            powerConsumption += 5; // Stromverbrauch steigt um 5
        }
    }
}

class Lamp {
    private List<Light> lights;

    public Lamp() {
        this.lights = new ArrayList<>();
    }

    public void addLightElement(Light light) {
        lights.add(light);
    }

    public void turnAllOn() {
        for (Light element : lights) {
            element.turnOn();
        }
    }

    public double getOverallPowerUsage() {
        double totalPower = 0;
        for (Light element : lights) {
            totalPower += element.getPowerConsumption();
        }
        return totalPower;
    }

    public void printNamesOfLightElements() {
        for (Light element : lights) {
            System.out.println(element.getName());
        }
    }
}
