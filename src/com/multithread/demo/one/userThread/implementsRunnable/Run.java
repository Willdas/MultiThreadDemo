package com.multithread.demo.one.userThread.implementsRunnable;

// 实现 Runnable接口
public class Run {
	public static void main(String[] args) {
		runnable();
		
	}
	
	public static void runnable() {
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束");
		
	}

}
