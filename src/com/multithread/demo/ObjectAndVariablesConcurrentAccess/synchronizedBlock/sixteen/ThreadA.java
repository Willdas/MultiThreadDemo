package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.sixteen;



public class ThreadA extends Thread {
	private MyService myService;

	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		myService.testMethod();
	}
}
