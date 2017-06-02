package com.multithread.demo.one.stopThread.four;

//  在沉睡中停止 


public class Run {
	public static void main(String[] args){
		//run1();
		run2();
	}
	
	// 先sleep 再用 interrupt() 停止
	public static void run1() {
		try {
			MyThread1 thread = new MyThread1();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt(); // 中止
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
	// 先interrupt() 停止 再sleep 
	public static void run2() {
		
		MyThread2 thread = new MyThread2();
		thread.start();
		thread.interrupt(); // 中止
		System.out.println("end");
	}
}
