package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eleven;

public class ThreadA extends Thread {
	
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		service.methodA();
	}
}
