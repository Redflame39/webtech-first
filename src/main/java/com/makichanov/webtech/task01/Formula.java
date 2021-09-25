package com.makichanov.webtech.task01;

public class Formula {
    public double calculateFormula(double x, double y) {
        double numeratorVal = 1 + Math.sin(x + y);
        double denominatorVal = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x,2) * Math.pow(y, 2)));
        return numeratorVal / denominatorVal + x;
    }

    public static void main(String[] args) {
        Formula formula = new Formula();
        System.out.println(formula.calculateFormula(2, 5));
    }
}
