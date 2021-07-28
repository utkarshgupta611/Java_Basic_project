package com.ust.thread;

public class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("in run .." + i);
			try {Thread.sleep(2);} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
//		mt.run();
		mt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("in main : " + i);
			try {Thread.sleep(2);} catch (InterruptedException e) {}
		}

	}
}
