package com.exceptions.demo;

public class MyThread extends Thread{
	public void run()
	{
		System.out.println("Inside run method by extending Thread class");
	}
public static void main(String args[])
{
	MyThread t1=new MyThread();
	t1.start();
	
}
}
