package xyz.alperen.projects.OO.Camera;

import java.util.ArrayList;

public class SDCard {
    private int capacity;
    private int usedSpace = 0;
    private ArrayList<Photo> photos;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.photos = new ArrayList<>();
    }

    public boolean savePhoto(Photo photo) {
        if (usedSpace + photos.size() > capacity) {
            System.out.println("Not enough Space to save a Photo!");
            return false;
        } else {
            photos.add(photo);
            usedSpace += photos.size();
            System.out.println("Photo saved!");
            return true;
        }
    }

    public void clearCard () {
        photos.clear();
        usedSpace = 0;
        System.out.println("Card cleared!");
    }

    public int getRemainingSpace() {
        return capacity - usedSpace;
    }

    @Override
    public String toString() {
        return "SDCard: " + usedSpace + "/" + capacity + "GB used";
    }
}
