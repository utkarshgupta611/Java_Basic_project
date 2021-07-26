package com.ust.collection;

public class ArrayTest {

	public static void main(String[] args) {
		// 1D Array
		String [] colorArray = {"Red", "Blue", "Green", "Purple", "Orange"};
		System.out.println(colorArray[3]);
		
		//2D Array
		String [][] nameArr = {{"Mr", "Mrs",},{"Utkarsh", "arsh", "divya"},{ "Gupta", "sharma"}};
		System.out.println(nameArr[0][0] + " " + nameArr[1][0] + " " + nameArr[2][0]);
		System.out.println(nameArr[0][1] + " " + nameArr[1][2] + " " + nameArr[2][1]);

	}

}
