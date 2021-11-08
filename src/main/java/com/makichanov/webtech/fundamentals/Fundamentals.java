package com.makichanov.webtech.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Fundamentals {

    public static void main(String[] args) {

    }

    public static double task1(double x, double y) {
        double numeratorVal = 1 + Math.sin(x + y);
        double denominatorVal = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x,2) * Math.pow(y, 2)));
        return numeratorVal / denominatorVal + x;
    }

    public boolean task2(double x, double y) {
        // top square opposite vertexes coordinates
        int x11 = -4;
        int y11 = 5;
        int x12 = 4;
        int y12 = 0;
        // bottom square opposite vertexes coordinates
        int x21 = -6;
        int y21 = 0;
        int x22 = 6;
        int y22 = -3;
        boolean belongsToTopSquare = ((x >= x11 && x <= x12) && (y <= y11 && y >= y12));
        boolean belongsToBottomSquare = ((x >= x21 && x <= x22) && (y <= y21 && y >= y22));
        return belongsToTopSquare || belongsToBottomSquare;
    }

    public static double[][] task3(double a, double b, double h) {
        int rows = (int) ((int) (b - a) / h) + 1;
        double[][] matrix = new double[rows][2];
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = a;
            matrix[i][1] = Math.tan(a);
            a += h;
        }
        return matrix;
    }

    public static void task4(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrimeTask4(array[i])) {
                System.out.println("array[" + i + "] = " + array[i] + " is prime");
                counter++;
            }
        }
        if (counter == 0) System.out.println("No prime numbers");
    }

    private static boolean isPrimeTask4(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int task5(int[] array) {
        int maxIncreasingLength = 0;
        int currentIncreasingLength = 0;
        boolean isIncreasing;
        for (int i = 0; i < array.length; i++) {
            isIncreasing = true;
            currentIncreasingLength = 1;
            for (int j = i + 1; (j < array.length) && isIncreasing; j++) {
                if (array[j - 1] < array[j]) {
                    currentIncreasingLength++;
                } else {
                    isIncreasing = false;
                }
            }
            maxIncreasingLength = Math.max(maxIncreasingLength, currentIncreasingLength);
        }
        return array.length - maxIncreasingLength;
    }

    public static int[][] task6(int[] array) {
        int[][] matrix = new int[array.length][array.length];
        int delta = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[(j + delta) % array.length];
            }
            delta++;
        }
        return matrix;
    }

    public static int[] task7(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1])
                i++;
            else {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i != 0)
                    i--;
            }
        }
        System.out.print("\nsorted ");
        return array;
    }

    public static List<Integer> merge(int[] first, int[] second) {
        int maxLength = first.length + second.length;
        ArrayList<Integer> result = new ArrayList<>();
        int indexFirst = 0;
        int indexSecond = 0;
        int currentIndex = 0;
        while (currentIndex < maxLength) {
            if ((indexFirst < first.length) && (indexSecond < second.length)) {
                if (first[indexFirst] == second[indexSecond]) {
                    result.add(first[indexFirst++]);
                    indexSecond++;
                    currentIndex += 2;
                } else if (first[indexFirst] < second[indexSecond]) {
                    result.add(first[indexFirst++]);
                    currentIndex++;
                } else if (second[indexSecond] < first[indexFirst]) {
                    result.add(second[indexSecond++]);
                    currentIndex++;
                }
            }
            if ((indexSecond >= second.length) && (indexFirst < first.length)) {
                result.add(first[indexFirst++]);
                currentIndex++;
            } else if ((indexFirst >= first.length) && (indexSecond < second.length)) {
                result.add(second[indexSecond++]);
                currentIndex++;
            }
        }
        return result;
    }

}
