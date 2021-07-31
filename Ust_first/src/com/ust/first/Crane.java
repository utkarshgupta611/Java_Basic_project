package com.ust.first;

public class Crane extends Vehicle implements Liftable{

    @Override
    public void lift() {
        System.out.println("crane is lifting");

    }
}
