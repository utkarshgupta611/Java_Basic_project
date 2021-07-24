package com.ust.gen;

public class GenericTest {

	public GenericTest() {
		super();
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		print(intArray);
		System.out.println();
		Double[] doubleArray = { 10.2, 52.3, 88.8, 56.3, 98.5 };
		print(doubleArray);
		System.out.println();
		Character[] charArray = {'U', 'S', 'T', ' ', 'G','l','o', 'b', 'a', 'l' };
		print(charArray);
		
		System.out.println();
		// vararg Testing
//		System.out.println(sum);
		System.out.println("sum of first 5 even : " + sum(2, 4, 6, 8, 10));
		
	}
	
	// vararg
	private int sum(Integer...arr) { 
		int sum = 0;
		
		for (Integer elem : arr) {
			sum += elem;
		}
		return sum;
		}
	

	public static void main(String[] args) {
		new GenericTest();
	}

	private <E> void print(E[] inputArray) {
		for (E elem : inputArray) {
			System.out.print(elem + ", ");
		}

	}
}
