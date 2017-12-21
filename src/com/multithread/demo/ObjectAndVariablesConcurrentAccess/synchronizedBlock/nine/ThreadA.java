package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.nine;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		Service.printA();
	}
	
}
