package com.ust.color;

public class ColorTest {

	public static void main(String[] args) {
		Color col = new Red();
		col.paint();
		col.paint();
		
		
		
		col = new Green();
		col.paint();
		col = new Color() {

			@Override
			public void paint() {
				System.out.println("Goods Know What todo");
				
			}
			
			
			
			
			};
		col.paint();
		col = () -> System.out.println("painting is going on");
	}

}
