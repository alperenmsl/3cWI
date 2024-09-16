public class Loops {
    public static void main(String[] args) {
        //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


        //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen
        // - Tipp: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2

        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }


    }
}
