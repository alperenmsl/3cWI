package xyz.alperen.projects.OO.Camera;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Camera {
    private Manufacturer manufacturer;
    private String color;
    private int weight;
    private String resolution;
    private Lens lens;
    private SDCard sdCard;

    public Camera(Manufacturer manufacturer, String color, int weight, String resolution) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.weight = weight;
        this.resolution = resolution;
        this.lens = null;
        this.sdCard = null;
    }

    public void attachLens(Lens lens) {
        this.lens = lens;
        System.out.println("Objektiv " + lens + " is active");
    }

    public void insertSDCard(SDCard sdCard) {
        this.sdCard = sdCard;
        System.out.println("SD-Card with " + sdCard.getRemainingSpace() + " GB has been inserted.");
    }

    public void setResolution(String resolution) {
        if (resolution.equals("small") || resolution.equals("medium") || resolution.equals("large")) {
            this.resolution = resolution;
            System.out.println("Resolution set on " + resolution + ".");
        } else {
            System.out.println("Invalid Resolution!");
        }
    }

    public void takePicture() {
        if (sdCard == null) {
            System.out.println("No SD-Card inserted!");
            return;
        }

        int sizeGB = switch (resolution) {
            case "small" -> 2;
            case "medium" -> 4;
            case "large" -> 6;
            default -> 4;
        };

        // Aktuelles Datum als String formatieren mit chatGPT
        String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        Photo photo = new Photo("Photo" + (sdCard.getRemainingSpace()), currentDate, sizeGB);

        if (sdCard.savePhoto(photo)) {
            System.out.println("*Photo has been taken*: " + photo);
        }
    }


    @Override
    public String toString() {
        return "Camera by " + manufacturer + " | Color: " + color + " | Weight: " + weight + "g";
    }
}
