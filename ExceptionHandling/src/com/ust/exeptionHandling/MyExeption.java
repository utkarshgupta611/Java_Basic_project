package com.ust.exeptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExeption {
	MyExeption() {
		System.out.println("Calculation");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Type Numerator");           // numerator
			int numerator = sc.nextInt();
			System.out.println("Type Denominator");         // denominator
			int denominator = sc.nextInt();
                                                            //method 
			int quotient = Divide(numerator, denominator);  // frw_to_func
			int Reminder = Modulo(numerator, denominator);
			                      //output
			System.out.println(denominator + " ) " + numerator + " ( " + quotient   );
			System.out.println("   ||");
			System.out.println("----------");
			System.out.println("    " + Reminder);
			                 //catch block
		} catch (ArithmeticException e) {
			System.out.println("Denominator can't be zero \n please try except zero");
		} catch (InputMismatchException e) {
			System.out.println("please enter number only");
		} finally {
			System.out.println("End of Program");
		}
			sc.close();
	}
	private int Divide(int numerator, int denominator){ // quotient_func
		int quotient = numerator / denominator;
		return quotient;
	}
	private int Modulo(int numerator, int denominator){ // quotient_func
		int Reminder = numerator % denominator;
		return Reminder;
	}
	public static void main(String[] args) { // main
		new MyExeption();
	}
}