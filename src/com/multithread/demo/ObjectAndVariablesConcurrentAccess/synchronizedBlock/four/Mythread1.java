package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.four;

public class Mythread1 extends Thread {
	
	private Task task;

	public Mythread1(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		task.doLongTimeTask();
	}
}
