package xyz.alperen.projects.OO.Camera;

public class Photo {
    private String name;
    private String date;
    private int sizeGB;

    public Photo(String name, String date, int sizeGB) {
        this.name = name;
        this.date = date;
        this.sizeGB = sizeGB;
    }

    public String getName() {
        return name;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Photo: " + name + " | " + date + " | Size: " + sizeGB + "GB";
    }
}
