package com.multithread.demo.one.userThread.extendThread;

public class MyThread3 extends Thread{
	
	private int i = 0;
	
	public MyThread3(int i) {
		super();
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println("i="+i);
	}

}
