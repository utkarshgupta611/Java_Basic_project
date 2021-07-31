package com.ust.first;

public class Bus extends Vehicle implements Movable{


    @Override
    public void move() {
        System.out.println("Bus is moving");
    }
}
