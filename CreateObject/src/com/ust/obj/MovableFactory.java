package com.ust.obj;

// Design Pattern called - Factory Pattern
public class MovableFactory {
	// Factory method
	public static Movable getInstance(String type) {
		if("car".equalsIgnoreCase(type)) {
			return new Car();
		}
		else if("bus".equalsIgnoreCase(type)) {
			return new Bus();
		}
		else if("van".equalsIgnoreCase(type)) {
			return new Van();
		}
		return new UnknownVehicle();
	}
	// inner class
	private static class UnknownVehicle implements Movable{

		@Override
		public void move() {
			System.out.println("Unknown vehicle moving");
			
		}
		
	}
}
