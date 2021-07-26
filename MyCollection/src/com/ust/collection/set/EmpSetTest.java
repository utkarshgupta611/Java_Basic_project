package com.ust.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class EmpSetTest {

	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(1234, "Utkarsh", 9041120661L));
		empSet.add(new Emp(1235, "Krishan", 8041830683L));
		empSet.add(new Emp(1239, "Sandeep", 9841450761L));
		empSet.add(new Emp(1235, "Krishan", 8041830683L));
		empSet.add(new Emp(1237, "Lovepreet", 9941120241L));
		empSet.add(new Emp(1238, "Anubhav", 92411540667L));
		System.out.println(empSet);
		
		SortedSet<Emp> sortedEmpSet =new TreeSet<>(empSet);
		System.out.println(sortedEmpSet);
	}

}
