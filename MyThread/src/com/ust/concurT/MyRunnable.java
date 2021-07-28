package com.ust.concurT;

public class MyRunnable implements Runnable {

	private int sno;
	
	public MyRunnable(int sno) {
		this.sno = sno;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println( i + "<run " + sno + ">");
			try {Thread.sleep(2);} catch (InterruptedException e) {}
			
		}
		System.out.println("Program End Here ..........." + sno);

	}

}
