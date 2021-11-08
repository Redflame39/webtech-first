package com.makichanov.webtech.task9;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> ballsList;

    public Basket() {
        this.ballsList = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        if (ball == null) return;
        this.ballsList.add(ball);
    }

    public void print() {
        for (Ball ball : ballsList) {
            System.out.println(ballsList.indexOf(ball) + ". Color: " + ball.getColor() + "; Weight: " + ball.getWeight());
        }
    }

    public int allBallsWeight() {
        return ballsList.stream()
                .mapToInt(Ball::getWeight)
                .sum();
    }


    public long concreteColorBallsQuantity(String color) {
        /*int quantity = 0;
        for (Ball ball : ballsList) {
            if (ball.getColor().equals(color.trim().toLowerCase())) {
                quantity++;
            }
        }
        return quantity;*/
        return ballsList.stream()
                .filter(b -> b.getColor().equals(color))
                .count();
    }
}
