package com.ust.concurT;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) {
		Callable<String> call1 = new MyCallable(1);
		Callable<String> call2 = new MyCallable(2);

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<String> future1 = es.submit(call1);
		Future<String> future2 = es.submit(call2);

		try {
			String result1 = future1.get();
			System.out.println("Result 1 : " + result1);
			String result2 = future2.get();
			System.out.println("Result 2 : " + result2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		es.shutdown();
	}

}
