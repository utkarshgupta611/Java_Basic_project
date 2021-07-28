package com.ust.validationP;

import java.util.Scanner;

public class EmailValidator {

	private boolean emailValidate(String input) {
		return input.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}

	private boolean passValidate(String input) {
		return input.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$");
							//^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$
	}

	private boolean MobileValidate(String input) {
		return input.matches("[7-9][0-9]{9}");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Email
	EmailValidator obj = new EmailValidator();
	System.out.println("Enter your Email");
	String input = sc.nextLine();
	boolean validEmail = obj.emailValidate(input);
    System.out.println("valid : " + validEmail);
    
    //Password
    System.out.println("Enter your password");
	String inputp = sc.nextLine();
	boolean validPass = obj.passValidate(inputp);
    System.out.println("valid : " + validPass);
    
    //Mobile
    System.out.println("Enter your mobile");
   	String inputm = sc.nextLine();
   	boolean validMobile = obj.MobileValidate(inputm);
    System.out.println("valid : " + validMobile);
    
     }

	


}
