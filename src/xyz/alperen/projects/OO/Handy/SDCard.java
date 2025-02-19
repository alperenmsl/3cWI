package xyz.alperen.projects.OO.Handy;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<PhoneFile>();
    }

    public void saveFile(PhoneFile file) {
        if (getFreeSpace() >= file.getSize()) {
            files.add(file);
            System.out.println("File saved: " + file.getName());
        } else {
            System.out.println("Not enough free space to save the file!");
        }
    }

    public List<PhoneFile> getFiles() {
        return files;
    }

    public int getFreeSpace() {
        int usedSpace = 0;
        for (PhoneFile file : files) {
            usedSpace += file.getSize(); // Größe jedes gespeicherten Files addieren
        }
        return capacity - usedSpace;
    }
}
