package com.ust.sync;

public class Producer implements Runnable {
	private SharedInterface so;

	public Producer(SharedInterface so) {
		this.so = so;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			so.setData(i);
		}

	}

	

}
