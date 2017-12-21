package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.eight;

public class MyThreadB extends Thread {
	
	private Sub sub;

	public MyThreadB(Sub sub) {
		super();
		this.sub = sub;
	}
	
	@Override
	public void run() {
		sub.serviceMethod();
	}
}
