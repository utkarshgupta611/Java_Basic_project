package com.ust.obj;

public class Van extends Vehicle implements Movable {

	@Override
	public void move() {
		System.out.println("Van is moving");		
	}

	public Van() {
		
	}

	
}