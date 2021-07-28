package com.ust.string;

public class ModifyString {
	
	private void Modify() {
		String str = new String("hello");
		modify(str);
		System.out.println("main modify " + str);
		
		StringBuilder sb = new StringBuilder("heyy");
		modifysb(sb);
		System.out.println("sb : " + sb);
	}
	private void modifysb(StringBuilder sb) {
		sb.append(" how are you ! ");
		
	}
	private void modify(String str) {
		str = str.concat(" friends ");
		System.out.println(" inside modify method " + str);
		
	}
	public static void main(String[] args) {
		new ModifyString().Modify();
	}


}
