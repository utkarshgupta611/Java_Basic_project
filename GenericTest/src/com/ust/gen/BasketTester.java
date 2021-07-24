package com.ust.gen;

public class BasketTester {

	public static void main(String[] args) {
		Basket<Integer> basket = new Basket<>();
		Basket<String> basket1 = new Basket<>();
		
		
		basket.setData(25);
		System.out.println(basket.getData());
		
		System.out.println();
		
		basket1.setData("my name is ");
		System.out.println(basket1.getData());
		
	}

}
