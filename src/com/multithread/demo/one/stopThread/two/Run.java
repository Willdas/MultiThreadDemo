package com.multithread.demo.one.stopThread.two;

/*
 * 判断线程是否是停止状态
 */

/*
 * 1.this.interrupted() 测试当前线程是否已经中断 -- > 运行this.interrupted() 方法的线程 执行之后具有将状态标识清除为false的功能
 * 2.this.isInterrupted() 测试线程是否已经中断  但不清除状态标识
 * 
 */

public class Run {
	public static void main(String[] args){
		//run1();
		//run2();
		run3();
	}
	
	public static void run1() {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt(); // 中止
			System.out.println("是否停止 1 ？=" + thread.interrupted()); // false
			System.out.println("是否停止 2 ？=" + thread.interrupted()); // false
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("end");
	}
	
	public static void run2() {
		Thread.currentThread().interrupt();
		System.out.println("是否停止 1 ？=" + Thread.interrupted());  // true
		System.out.println("是否停止 2 ？=" + Thread.interrupted());  // false
		System.out.println("end");
		
	}
	
	public static void run3() {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("是否停止 1 ？=" + thread.isInterrupted()); // false
			System.out.println("是否停止 2 ？=" + thread.isInterrupted()); // false
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
