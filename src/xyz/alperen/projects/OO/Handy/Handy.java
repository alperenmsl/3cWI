package xyz.alperen.projects.OO.Handy;

import java.util.List;

public class Handy {
    private String color;
    private Sim sim;
    private Camera camera;
    private SDCard sdCard;

    public Handy(String color, Sim sim, Camera camera, SDCard sdCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
    }

    public void takePicture() {
        if (sdCard.getFreeSpace() > 0) {
            PhoneFile photo = camera.makePicture();
            sdCard.saveFile(photo);
            System.out.println("Taking picture");
        } else {
            System.out.println("No enough free space");
        }
    }

    public void makeCall(String number) {
        sim.doCall(number);
    }

    public void printAllFiles() {
        List<PhoneFile> files = sdCard.getFiles();
        if (files.isEmpty()) {
            System.out.println("No files on SD card.");
        } else {
            System.out.println("Files on SD card:");
            for (PhoneFile file : files) {
                file.getInfo();
            }
        }
    }

}
