package xyz.alperen.projects.OO.Calculator;

public class Basics {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division durch null ist nicht erlaubt");
        }
        return a / b;
    }


}
