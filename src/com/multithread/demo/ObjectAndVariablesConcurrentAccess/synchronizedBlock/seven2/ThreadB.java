package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven2;

public class ThreadB extends Thread {
	
	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.setUsernamePassWord("b", "bb");
	}
}
