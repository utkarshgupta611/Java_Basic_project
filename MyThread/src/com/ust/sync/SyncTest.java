package com.ust.sync;

public class SyncTest {

	public static void main(String[] args) {
		SharedInterface so = new SharedObject();
		Runnable prod = new Producer(so);
		new Thread(prod).start();
		Runnable cons = new Consumer(so);
		new Thread(cons).start();
	}

}
