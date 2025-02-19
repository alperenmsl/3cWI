package xyz.alperen.projects.OO.Handy;

public class Main {
    public static void main(String[] args) {
        Sim s1 = new Sim(1, "+43 664-2600606");

        Camera cam = new Camera(140);

        SDCard sd1 = new SDCard(360);

        Handy myPhone = new Handy("Black", s1, cam, sd1);

        System.out.println("\nMaking a call...");
        myPhone.makeCall("+43 678-7820939");

        System.out.println("\nTaking pictures...");
        myPhone.takePicture();
        myPhone.takePicture();

        //System.out.println("Free space left: " + myPhone.getFreeSpace() + " MB");

        System.out.println("\nPrinting all files:");
        myPhone.printAllFiles();
    }
}
