package com.exceptions.demo;

public class MyRunnable implements Runnable {

	public static void main(String[] args) {
		
		MyRunnable run=new MyRunnable();
		Thread t=new Thread(run);
		t.start();

	}

	
	public void run() {
		System.out.println("Inside run method by implementing Runnable interface");
		
	}

}
