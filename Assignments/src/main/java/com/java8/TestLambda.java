package com.java8;

public class TestLambda {

	public static void main(String[] args) {

		Runnable run = () -> System.out.println(" Thread is Running");
		Thread r1 = new Thread(run);
		r1.start();

	}

}
