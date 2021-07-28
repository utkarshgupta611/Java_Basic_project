package com.ust.concurT;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	private int sno;

	public MyCallable(int sno) {
		this.sno = sno;

	}

	@Override
	public String call() throws Exception {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "<call " + sno + " > ");

			Thread.sleep(2);
		}

		return sno + ") MuCallable run at time :" + System.currentTimeMillis();
	}

}
