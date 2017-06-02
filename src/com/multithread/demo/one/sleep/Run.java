package com.multithread.demo.one.sleep;

/*
 * 方法 sleep() 的 作用 是在 指定的毫秒内让当前正在运行的线程进入休眠状态
 */

// 这个"正在执行的线程" 是指 this.currentThread() 返回的线程

public class Run {
	public static void main(String[] args) throws InterruptedException {
		
		//run1();
		run2();
	}
	
	public static void run1(){
		MyThread1 myThread = new MyThread1();
		System.out.println("begin= "+ System.currentTimeMillis());
		myThread.run();
		System.out.println("end= "+System.currentTimeMillis());
	}
	
	// 由于main线程与MyThread2线程是异步执行，所以首先打印的信息为begin和end
	// 而MyThread2线程是随后运行的，在最后的两行打印的 run begin 和 run end 相关的信息
	public static void run2(){
		MyThread2 myThread2 = new MyThread2();
		System.out.println("begin= "+ System.currentTimeMillis());
		myThread2.start();
		System.out.println("end= "+System.currentTimeMillis());
	}
}
