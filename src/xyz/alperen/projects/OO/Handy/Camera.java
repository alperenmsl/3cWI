package xyz.alperen.projects.OO.Handy;

public class Camera {
    private int resolution;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public PhoneFile makePicture() {
        String fileName = "_photo_" + ".jpg";
        int fileSize = resolution;

        return new PhoneFile(".jpg", fileSize, fileName);
    }
}
