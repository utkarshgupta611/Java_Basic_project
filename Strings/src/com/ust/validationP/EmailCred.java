package com.ust.validationP;

public class EmailCred {

	public Boolean validate(String input) {
		return input.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	}






}
