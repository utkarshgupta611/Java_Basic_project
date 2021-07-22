package com.ust.obj;

import java.util.Scanner;

public class CreateObject {

	public static void main(String[] args) {
		Car c1 = new Car(5, "Swift", 750000);
		System.out.println(c1);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter type of vehicle <com.ust.obj.Car, com.ust.obj.Van, com.ust.obj.Bus>");
		String type = scan.nextLine();
		Driver driver = new Driver();
		//Movable m1 = MovableFactory.getInstance(type);
		Movable m1 = CreateFromName.getInstance(type);
		if (m1 != null) {
			//m1.move();
			driver.drive(m1);
		}
		else {
			System.out.println(type + " not available");
		}
	}

}
