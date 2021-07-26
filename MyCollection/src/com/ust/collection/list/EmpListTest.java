package com.ust.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpListTest {

	public static  void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(1234, "Utkarsh", 9041120661L));
		empList.add(new Emp(1235, "Krishan", 8041830683L));
		empList.add(new Emp(1239, "Sandeep", 9841450761L));
		empList.add(new Emp(1237, "Lovepreet", 9941120241L));
		empList.add(new Emp(1238, "Anubhav", 92411540667L));
		
//		System.out.println(empList);
//		
//		System.out.println(empList);
//		System.out.println(empList.get(2));
		
		System.out.println("Sorted by ID");
		empList.sort((e1, e2)-> e1.getId()-e2.getId()); // in java 8 its introduce lambda
//		Collections.sort(empList, new EmpComparator(SortField.ID));
		System.out.println(empList);
	
		System.out.println("Sorted by Name");
		empList.sort((e1, e2)-> e1.getName().compareTo(e2.getName())); // now dont need for comprator
//		Collections.sort(empList, new EmpComparator(SortField.NAME));
		System.out.println(empList);
		
		System.out.println("Sorted by Mobile");
		empList.sort((e1, e2)-> (int)(e1.getMobile()-e2.getMobile()));
//		Collections.sort(empList, new EmpComparator(SortField.MOBILE));
		System.out.println(empList);
		
	}

}

/*
pass the argument in EmpComparator that create a enum class so no typo mistake occur ,
and in EmpComparator create case switch so that u need to pass condition.
*/
