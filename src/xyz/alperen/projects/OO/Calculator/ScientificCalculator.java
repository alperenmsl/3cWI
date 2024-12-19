package xyz.alperen.projects.OO.Calculator;

public class ScientificCalculator extends Basics {
    public double sin(double winkelInGrad) {
        double radians = Math.toRadians(winkelInGrad);
        return Math.sin(radians);
    }

    public double cos(double winkelInGrad) {
        double radians = Math.toRadians(winkelInGrad);
        return Math.cos(radians);
    }

    public double tan(double winkelInGrad) {
        double radians = Math.toRadians(winkelInGrad);
        return Math.tan(radians);
    }
}
