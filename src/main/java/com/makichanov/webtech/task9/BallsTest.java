package com.makichanov.webtech.task9;

public class BallsTest {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball("blue", 100));
        basket.addBall(new Ball("red", 200));
        basket.addBall(new Ball("orange", 150));
        basket.addBall(new Ball("white", 300));
        basket.addBall(new Ball("black", 50));
        basket.addBall(new Ball("yellow", 150));
        basket.addBall(new Ball("blue", 50));
        basket.addBall(new Ball("navy", 1000));
        basket.print();
        System.out.println("Total balls weight: " + basket.allBallsWeight());
        System.out.println("Blue balls quantity: " + basket.concreteColorBallsQuantity("blue"));
    }
}
