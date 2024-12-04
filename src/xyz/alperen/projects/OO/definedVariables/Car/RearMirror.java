package xyz.alperen.projects.OO.definedVariables.Car;

public class RearMirror {
    private int size;
    private int position; // 0 ist neutral und -10 nach links + 10 nach rechts gerichtet

    public RearMirror(int size, int position) {
        this.size = size;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public int getSize() {
        return size;
    }

}
