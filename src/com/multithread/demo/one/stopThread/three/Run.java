package com.multithread.demo.one.stopThread.three;

/*
 * 能停止的线程 —— 异常法
 */


public class Run {
	public static void main(String[] args){
		//run1();
		run2();
	}
	
	public static void run1() {
		try {
			MyThread1 thread = new MyThread1();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt(); // 中止
		
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
	public static void run2() {
		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt(); // 中止
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
