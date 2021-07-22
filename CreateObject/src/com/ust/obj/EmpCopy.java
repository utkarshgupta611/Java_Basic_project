package com.ust.obj;

public class EmpCopy {
	public static void main(String[] args) {
		Emp emp1 = new Emp(177812, "Utkarsh", 9041120661L);
		Emp emp2 = new Emp(emp1);
		
		System.out.println(emp1 == emp2);
		System.out.println(emp2);
	}
}
