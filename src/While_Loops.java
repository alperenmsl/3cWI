import java.util.Random;

public class While_Loops {
    public static void main(String[] args) {
        // Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert.
        // Das Programm soll die Zufallszahlen zusammenzählen.
        // Sobald die Zahl 15 oder die Zahl 25 kommt,
        // wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!


        Random random = new Random();

        boolean isFinished = false;

        while (!isFinished){

            int randomNumber = random.nextInt(10, 31);

            System.out.println("Random Number: " + randomNumber);

            if (randomNumber == 15 || randomNumber == 25){

                isFinished = true;
                System.out.println("Finished");

            }

        }



    }
}
