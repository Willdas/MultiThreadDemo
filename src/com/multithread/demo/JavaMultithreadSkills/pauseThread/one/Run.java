package com.multithread.demo.JavaMultithreadSkills.pauseThread.one;

/*
 * 暂停线程意味着线程还可以继续运行，在java多线程中，可以使用suspend方法暂停线程，使用resume()方法恢复线程的执行
 */

/*
 * suspeng 和 resume 的使用
 */

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(1000);
		
		// A端
		thread.suspend();
		System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
		Thread.sleep(5000);
		System.out.println("A=" + System.currentTimeMillis() + " i=" + thread.getI());
		// B端
		thread.resume();
		Thread.sleep(5000);
		
		// C端
		thread.suspend();
		System.out.println("B=" + System.currentTimeMillis() + " i=" +thread.getI());
		Thread.sleep(5000);
		System.out.println("B=" + System.currentTimeMillis() + " i=" +thread.getI());
		
	}
	
}
