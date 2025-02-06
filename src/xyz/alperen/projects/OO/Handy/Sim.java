package xyz.alperen.projects.OO.Handy;

public class Sim {
    private int id;
    private String number;

    public Sim(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void doCell(String targetNumber){
        System.out.println("Calling " + targetNumber + " from " + this.number);
    }

}
