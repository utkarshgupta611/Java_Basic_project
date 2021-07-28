package com.ust.validationP;

public class NumCred  {

	public Boolean validate(String inputm) {
		return inputm.matches("[7-9][0-9]{9}");
	}


}
