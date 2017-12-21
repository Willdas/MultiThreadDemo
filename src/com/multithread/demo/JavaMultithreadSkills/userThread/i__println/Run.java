package com.multithread.demo.JavaMultithreadSkills.userThread.i__println;

/*
 * 留意 i-- 和 System.out.println() 
 */

// 虽然 println() 方法在内部是同步的，但是i-- 的操作却是在进入prinln() 方法之前进入的 所以有发生非线程安全问题的概率  
// 需要加上 synchronized 关键字
public class Run {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		Thread t3 = new Thread(myThread);
		Thread t4 = new Thread(myThread);
		Thread t5 = new Thread(myThread);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}
}
