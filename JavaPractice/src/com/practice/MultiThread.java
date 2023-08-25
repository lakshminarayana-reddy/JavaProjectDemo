package com.practice;

public class MultiThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		MultiThread thread = new MultiThread();
		Thread t = new Thread(thread);
		t.start();
		System.out.println("Bye");
	}
}
