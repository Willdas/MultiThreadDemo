package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.six2;

public class MyThread extends Thread {

	private MySerive mySerive;

	public MyThread(MySerive mySerive) {
		super();
		this.mySerive = mySerive;
	}

	@Override
	public void run() {
		mySerive.addNum();
	}
}
