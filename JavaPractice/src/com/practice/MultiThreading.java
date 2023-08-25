package com.practice;

public class MultiThreading extends Thread {
	public void run() {
		for(int i=0; i<=5; i++)
			System.out.println("Hi");
	}

	public static void main(String[] args) {
		MultiThreading thread = new MultiThreading();
		thread.start();
		for(int j=0; j<=5; j++)
			System.out.println("Bye");
	}

}
