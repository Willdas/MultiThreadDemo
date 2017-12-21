package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.four;

public class Mythread2 extends Thread {
	
	private Task task;

	public Mythread2(Task task) {
		super();
		this.task = task;
	}
	
	@Override
	public void run() {
		super.run();
		task.doLongTimeTask();
	}
}
