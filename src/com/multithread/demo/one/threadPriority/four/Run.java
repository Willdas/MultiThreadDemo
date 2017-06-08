package com.multithread.demo.one.threadPriority.four;


/*
 * 看谁运行快
 */

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
	
			
			MyThread myThread = new MyThread();
			myThread.setPriority(Thread.NORM_PRIORITY - 3);
			myThread.start();
			
			MyThread2 myThread2 = new MyThread2();
			myThread2.setPriority(Thread.NORM_PRIORITY - 3);
			myThread2.start();
			Thread.sleep(1000);
		    myThread.stop();
		    myThread2.stop();
		    
		    System.out.println("myThread=" + myThread.getCount());
		    System.out.println("myThread2=" + myThread2.getCount());
	}
	
}
