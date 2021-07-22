package com.ust.obj;

public class empClone {
	public static void main(String[] args) {
		Emp emp1 = new Emp(177812, "Utkarsh", 9464631321L);
		Emp emp2 = null;

		try {
			emp2 = (Emp) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(emp2);
		System.out.println(emp1 == emp2);
	}

}
