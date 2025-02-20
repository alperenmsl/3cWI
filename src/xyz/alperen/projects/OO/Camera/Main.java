package xyz.alperen.projects.OO.Camera;

public class Main {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("Sony", "Germany");
        Manufacturer m2 = new Manufacturer("Samsung", "China");

        Camera myCam = new Camera(m1, "Black", 308, "large");
        System.out.println(myCam);

        Lens l1 = new Lens(m1, 20);
        myCam.attachLens(l1);

        SDCard s1 = new SDCard(16);
        myCam.insertSDCard(s1);

        myCam.setResolution("large");


        myCam.takePicture();
        myCam.takePicture();
        myCam.takePicture();
        myCam.takePicture();
        myCam.takePicture();

        myCam.takePicture(); // Da unsere SD Card nur eine Capacity von 16GB hat könne nur die ersten 5 Fotos gespeichert werden

        System.out.println(s1);
    }
}
