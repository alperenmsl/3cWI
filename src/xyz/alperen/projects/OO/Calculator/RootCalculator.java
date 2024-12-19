package xyz.alperen.projects.OO.Calculator;

public class RootCalculator extends Basics{
    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Error: Wurzel aus einer negativen Zahl ist nicht möglich.");
        }
        return Math.sqrt(a);
    }
}
