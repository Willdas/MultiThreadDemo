package com.multithread.demo.one.userThread.extendThread;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
}
