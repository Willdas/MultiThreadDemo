package com.multithread.demo.JavaMultithreadSkills.threadPriority.one;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThread2 run priority= " + this.getPriority());
	}

}
