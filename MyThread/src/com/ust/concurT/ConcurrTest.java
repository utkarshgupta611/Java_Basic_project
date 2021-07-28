package com.ust.concurT;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrTest {

	public static void main(String[] args) {
		Runnable mr1 = new MyRunnable(1);
		Runnable mr2 = new MyRunnable(2);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		
		es.submit(mr1);
		es.submit(mr2);
		
		es.shutdown();
		
		System.out.println("main");
		
	}

}
