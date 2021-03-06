package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.two;

public class ThreadB extends Thread {
	
	private ObjectService objectService;

	public ThreadB(ObjectService objectService) {
		super();
		this.objectService = objectService;
	}
	
	@Override
	public void run() {
		super.run();
		objectService.serviceMethod();
	}
}
