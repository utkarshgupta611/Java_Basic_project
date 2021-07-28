package com.ust.validationP;

import java.util.Scanner;

public class UserCredentialValidate {
	public static void main(String[] args) {
			
		
		EmailCred email = new EmailCred();
		PassCred password = new PassCred();
		NumCred number = new NumCred();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Email");
		String input = scan.nextLine();
		Boolean Validemail = email.validate(input);
		System.out.println("valid : " + Validemail);
		
		System.out.println("Enter Password");
		String inputp = scan.nextLine();
		Boolean Validepass = password.validate(inputp);
		System.out.println("valid : " + Validepass);
		
		System.out.println("Enter Number");
		String inputm = scan.nextLine();
		Boolean Validmobile = number.validate(inputm);
		System.out.println("valid : " + Validmobile);
		
	}
}
