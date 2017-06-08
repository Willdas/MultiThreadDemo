package com.multithread.demo.one.daemonThread;

/*
 * 守护线程
 */

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(5000);
		System.out.println("我离开 thread 对象也不在打印了，也就是停止了！");
		
	}
	
}
