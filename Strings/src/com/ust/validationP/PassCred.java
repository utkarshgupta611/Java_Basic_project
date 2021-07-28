package com.ust.validationP;

public class PassCred {

	public Boolean validate(String inputp) {
		return inputp.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$");
	}


	

}
