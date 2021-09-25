package com.makichanov.webtech.task02;

public class Square {

    // top square opposite vertexes coordinates
    private int x11 = -4;
    private int y11 = 5;
    private int x12 = 4;
    private int y12 = 0;
    // bottom square opposite vertexes coordinates
    private int x21 = -6;
    private int y21 = 0;
    private int x22 = 6;
    private int y22 = -3;

    public boolean isPointBelongsSquare(double x, double y) {
        boolean belongsToTopSquare = ((x >= x11 && x <= x12) && (y <= y11 && y >= y12));
        boolean belongsToBottomSquare = ((x >= x21 && x <= x22) && (y <= y21 && y >= y22));
        return belongsToTopSquare || belongsToBottomSquare;
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.isPointBelongsSquare(1, 2));
        System.out.println(square.isPointBelongsSquare(4, 5));
        System.out.println(square.isPointBelongsSquare(10, 10));
    }
}
