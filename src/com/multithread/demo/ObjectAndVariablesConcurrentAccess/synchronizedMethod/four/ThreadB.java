package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.four;

public class ThreadB extends Thread {
	
	private MyObject myObject;

	public ThreadB(MyObject myObject) {
		super();
		this.myObject = myObject;
	}
	
	@Override
	public void run() {
		super.run();
		myObject.methodA();
	}
	
}
