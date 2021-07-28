package com.ust.string;

public class StringTests {
	
	public static void main(String[] args) {
		String str1= "hello"; // strings Literals
		String str2 ="hello"; // strings Literals
		String str5 ="good"; // strings Literals
		System.out.println(str1 == str2);
		System.out.println(str1 != str2);
		System.out.println(str1 != str5);
		
		// new keywords
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println("while Using new keywords");
		System.out.println(str3 == str4);
	}

}
