package com.multithread.demo.one.stopThread.one;

/*
 *  停止不了的线程
 */

// 使用 interrupt() 方法 来停止线程

public class Run {
	
	public static void main(String[] args) {
		
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt(); // 中止
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
