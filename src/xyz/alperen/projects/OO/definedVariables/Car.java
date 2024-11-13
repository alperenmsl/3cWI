package xyz.alperen.projects.OO.definedVariables;

// Importe für den honk sound

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioInputStream;
import java.io.File;
import java.io.IOException;

public class Car {
    public String brand;
    public String modell;
    public String serialNumber;
    public String color;

    public Car(String brand, String modell, String color) {
        this.brand = brand;
        this.modell = modell;
        this.color = color;
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
