package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven2;

public class ThreadA extends Thread {
	
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.setUsernamePassWord("a", "aa");
	}
}
