package xyz.alperen.projects.OO.definedVariables.newCar;

public class Tires {
    private int zoll; // Größe - 10 zoll = 25,4 cm
    private String typ; // Sommer, Winter, Allwetter
    private double profilTiefe; // z.B. 7,3 mm bei einer G-Klasse
    private double luftdruck; // in bar

    public Tires(int zoll, String typ, double profilTiefe, double luftdruck) {
        this.zoll = zoll;
        this.typ = typ;
        this.profilTiefe = profilTiefe;
        this.luftdruck = luftdruck;
    }

    public void aufpumpen(double druck) {
        if (druck < 0 || druck > 4) {
            System.out.println("Warnung: Der angegebene Druck von " + druck + " bar ist unrealistisch!");
        } else {
            this.luftdruck = druck;
            System.out.println("Der Reifen hat nun einen Druck von " + druck + " bar.");
        }
    }

    public void abnutzen(double abnutzung) {
        if (abnutzung < 0) {
            System.out.println("Ungültige Abnutzungsangabe.");
        } else if (this.profilTiefe - abnutzung < 0) {
            this.profilTiefe = 0;
            System.out.println("Der Reifen ist vollständig abgenutzt!");
        } else {
            this.profilTiefe -= abnutzung;
            System.out.println("Die Profiltiefe beträgt nun " + this.profilTiefe + " mm.");
        }
    }

    public String checkProfil() {
        if (this.profilTiefe < 1.6) {
            return "Warnung: Profiltiefe ist unter 1.6 mm! Ersetzen Sie den Reifen.";
        } else {
            return "Profiltiefe ist ausreichend: " + this.profilTiefe + " mm.";
        }
    }

    public double getLuftdruck() {
        return luftdruck;
    }

    public void setLuftdruck(double luftdruck) {
        this.luftdruck = luftdruck;
    }

    public double getProfilTiefe() {
        return profilTiefe;
    }

    public void setProfilTiefe(double profilTiefe) {
        this.profilTiefe = profilTiefe;
    }

    public int getZoll() {
        return zoll;
    }

    public String getTyp() {
        return typ;
    }
}
