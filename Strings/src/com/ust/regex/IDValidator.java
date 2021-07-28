package com.ust.regex;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDValidator {
	private String regex = "^(\\d{3}-?\\d{2}-?\\d{4})$";
	/*
	 * ^ start of line () one group \d{n} match n digits, where n>0 -? match a
	 * hyphen, optional $ end of line
	 */
	private Pattern pattern;
	private Matcher matcher;

	public IDValidator() {
		pattern = Pattern.compile(regex);
	}

	private boolean validate(String input) {
		boolean valid = true;
		matcher = pattern.matcher(input);
		valid = matcher.matches();
		return valid;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IDValidator obj = new IDValidator();
		System.out.println("Enter the * digit ID");
		String input = sc.nextLine();
		boolean valid = obj.validate(input);
		System.out.println("valid : " + valid);
	}

//private boolean validate(String input) {
//	return input.matches("\\d{3} -?\\d{3}-?\\d{4}");
////	return input.matches("\\d{3} " + -? + "\\d{3} " +  -? + " \\d{3} ");
//}
}
