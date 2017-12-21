package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.two;

public class ThreadB extends Thread{
	private HasSelfPrivateNum hasSelfPrivateNum;

	public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
		super();
		this.hasSelfPrivateNum = hasSelfPrivateNum;
	}
	
	@Override
	public void run() {
		super.run();
		hasSelfPrivateNum.addI("b");
	}
	

}
