package com.ust.sync;

public class SharedObject implements SharedInterface {

	private int data;

	synchronized public void setData(int data) {
		notify();
		this.data = data;
		System.out.println("setting " + data);
		try {
			wait(1000);
		} catch (InterruptedException e) {
		}

	}

	synchronized public int getData() {
		notify();
		int temp = data;
		System.out.println("... getting" + temp);
		try {
			wait(1000);
		} catch (InterruptedException e) {}
		return temp;
	}

}
