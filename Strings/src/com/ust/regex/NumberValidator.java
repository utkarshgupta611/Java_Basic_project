package com.ust.regex;

import java.util.Scanner;

public class NumberValidator {

	private boolean validate(String input) {
		return input.matches("\\d{5}");
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	NumberValidator obj = new NumberValidator();
	System.out.println("Enter 5 Digit Number");
	String input = sc.nextLine();
	boolean valid = obj.validate(input);
    System.out.println("valid : " + valid);
     }

}
