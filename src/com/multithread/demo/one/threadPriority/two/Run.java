package com.multithread.demo.one.threadPriority.two;

/*
 *  优先级具有规则性，
 *  虽然使用setPriority()方法 可以设置线程的优先级，但还没有看到设置优先级所带来的效果
 */

// 线程优先级与代码块执行顺序无关，出现这样的结果因为设置优先级的大小，说明线程优先级具有一定的规则性，也就是CPU尽量
// 将执行资源让给优先级高的线程。

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
		for (int i = 0; i < 50; i++) {
			
			MyThread myThread = new MyThread();
			myThread.setPriority(10);
			myThread.start();
			
			MyThread2 myThread2 = new MyThread2();
			myThread2.setPriority(1);
			myThread2.start();
		}
		
		
	}
	
}
