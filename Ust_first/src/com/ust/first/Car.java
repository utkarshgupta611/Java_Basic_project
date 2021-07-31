package com.ust.first;

public class Car extends Vehicle implements Movable{
    @Override
    public void move() {
        System.out.println("car is moving");
    }
}

