package xyz.alperen.projects.OO.definedVariables;

// Importe für den honk sound

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import java.io.File;
import java.io.IOException;

public class Car {

    public int fuelAmount;
    public double fuelConsumption;
    public int fuelCapacity;
    public String brand;
    public String modell;
    public String serialNumber;
    public String color;

    public Car(String brand, String modell, String color) {
        this.brand = brand;
        this.modell = modell;
        this.color = color;
        this.fuelAmount = 100;
        this.fuelCapacity = 50;
        this.fuelConsumption = 5.0;
    }

    public void turboBoost() {
        if (fuelAmount > (fuelCapacity * 0.10)) {
            System.out.println("Turbo Boost activated");
        } else {
            System.out.println("Not enough fuel to get a super Boost!");
        }
    }

    public double getRemainingRange() {
        return (fuelAmount / fuelConsumption) * 100;
    }


    public void doBreak() {
        System.out.println("Ich bremse.");
    }

    public void honk(int amountOfRepetition) {
        for (int i = 0; i < amountOfRepetition; i++) {
            System.out.println("Tuut");
            playHonkSound();
        }
    }

    //Made with ChatGPT
    private void playHonkSound() {
        try {

            File soundFile = new File("src/xyz/alperen/projects/OO/definedVariables/resources/honk.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (Exception e) {
            System.err.println("Fehler beim Abspielen der Audiodatei: " + e.getMessage());
        }
    }


}
