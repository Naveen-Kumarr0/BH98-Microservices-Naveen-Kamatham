package com.java8;

public class Test implements Runnable {

	@Override
	public void run() {

		System.out.println("Thread is Running");

	}

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.run();

		Thread t2 = new Thread(new Test());
		t2.start();
		t2.run();

	}

}
