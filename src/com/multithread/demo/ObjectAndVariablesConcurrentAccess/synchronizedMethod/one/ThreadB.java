package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.one;

public class ThreadB extends Thread{
	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}

}
