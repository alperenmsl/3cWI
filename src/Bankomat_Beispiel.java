import java.util.Scanner;

public class Bankomat_Beispiel {
    public static void main(String[] args) {

        // Diese Aufgabe setzt sich aus allen gelernten Inhalten zusammen!
        // Erstelle ein Programm, das einen Bankomaten simuliert. Folgende Möglichkeiten gibt es:
        // 1. Einzahlen
        // 2. Abheben
        // 3. Kontostand
        // 4. Beenden

        int balance = 0;
        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);

        while (!isFinished) {

            System.out.println("1. Einzahlen");
            System.out.println("2. Auszahlen");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("Geben Sie den Betrag ein, der ausgezahlt werden soll: ");
                    int einzahlen = scanner.nextInt();
                    if (einzahlen > balance) {
                        balance += einzahlen;
                        System.out.println(einzahlen + "€ wurden erfolgreich eingezahlt!");
                    } else {
                        System.out.println("Ungültiger Betrag!");
                    }
                    break;

                case 2:
                    System.out.println("Geben Sie den Betrag ein, der ausgezahlt werden soll: ");
                    int auszahlen = scanner.nextInt();
                    if (auszahlen > 0 && auszahlen <= balance) {
                        balance -= auszahlen;
                        System.out.println(auszahlen + "€ wurden erfolgreich ausgezahlt!");
                    } else if (auszahlen > balance) {
                        System.out.println("Nicht genügend Guthaben! Arbeiten sie härter!");
                    } else {
                        System.out.println("Ungültiger Betrag!");
                    }
                    break;

                case 3:
                    System.out.println(balance + "€ befinden sich auf dem Konto");
                    break;

                case 4:
                    System.out.println("Vielen dank für ihren Besuch!");
                    isFinished = true;
                    break;
            }
        }


    }
}
