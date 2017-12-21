package com.multithread.demo.JavaMultithreadSkills.stopThread.seven;

public class MyThread extends Thread{
	private SynchronizedObject synchronizedObject;

	public MyThread(SynchronizedObject synchronizedObject) {
		super();
		this.synchronizedObject = synchronizedObject;
	}
	
	@Override
	public void run() {
		synchronizedObject.printString("b", "bb");
	}
	
}
