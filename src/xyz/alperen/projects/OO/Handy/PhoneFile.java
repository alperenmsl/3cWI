package xyz.alperen.projects.OO.Handy;

public class PhoneFile {
    private String extension;
    private int size;
    private String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getExtension() {
        return extension;
    }

    public String getName() {
        return name;
    }

    public void getInfo() {
        System.out.println("File Name: " + name);
        System.out.println("Extension: " + extension);
        System.out.println("Size: " + size + " KB");
    }

}
