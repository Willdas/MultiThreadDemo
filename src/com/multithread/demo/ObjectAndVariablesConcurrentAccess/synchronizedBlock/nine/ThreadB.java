package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.nine;

public class ThreadB extends Thread {

	@Override
	public void run() {
		Service.printB();
	}
}
