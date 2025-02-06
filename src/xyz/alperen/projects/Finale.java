package xyz.alperen.projects;

public class Finale {
    final int maxSpeedAtAutobahn = 130; //final wird eingesetzt damit man keinen Zugriff mehr hat den wert zu ändern

    public int getX() {
        return maxSpeedAtAutobahn;
    }


    public static void main(String[] args) {
        Finale f1 = new Finale();
        //f1.maxSpeedAtAutobahn = 150; // wird einen error geben, da wir den wert für x nicht mehr nach der methode final nicht mehr ändern können
        System.out.println(f1.maxSpeedAtAutobahn);
    }
}