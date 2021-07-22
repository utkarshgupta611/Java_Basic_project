package com.ust.obj;

public class Car extends Vehicle implements Movable {

	@Override
	public void move() {
		System.out.println("Car is moving");

	}

	@Override
	public String toString() {
		return "Car " + super.toString();
	}

	public Car() {
		super();
		
	}

	public Car(int tyres, String type, double cost) {
		super(tyres, type, cost);
		// TODO Auto-generated constructor stub
	}
}
