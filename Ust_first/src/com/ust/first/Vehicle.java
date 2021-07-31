package com.ust.first;

public abstract class Vehicle {
    private int tyres;
    private String type;
    private double cost;

//    public abstract void move();

    public int getTyres() {
        return tyres;
    }
    public void setTyres(int tyres) {
        this.tyres = tyres;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
}
