package com.makichanov.webtech.task9;

public class Ball {
    private String color;

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Ball(String color, int weight) {
        this.color = color.trim().toLowerCase();
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color.trim().toLowerCase();
    }
}
