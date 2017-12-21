package com.multithread.demo.JavaMultithreadSkills.currentThread;

/*
 *  currentThread() 方法 可返回代码段正在被哪个线程调用的信息
 */
public class Run{
	public static void main(String[] args) {
		run1();
		run2();
	}
	
	public static void run1() {
		MyThread myThread = new MyThread();
		myThread.start();  // 被 Thread-0 线程调用
		//myThread.run();    // 被 main 方法调用
		System.out.println(Thread.currentThread().getName()); // main方法被名为main的线程调用
	}
	
	public static void run2() {
		CountOperate countOperate = new CountOperate();
		Thread thread = new Thread(countOperate);
		thread.setName("A");
		thread.start();
	}
}
