package com.multithread.demo.one.threadPriority.one;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThread run priority= " + this.getPriority());
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
	}

}
