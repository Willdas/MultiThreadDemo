package com.multithread.demo.JavaMultithreadSkills.currentThread;

public class MyThread extends Thread{
	
	public MyThread() {
		System.out.println("构造方法打印:"+Thread.currentThread().getName());  //被main线程调用
	}

	@Override
	public void run() {
		System.out.println("run方法:"+Thread.currentThread().getName());
	}

}
