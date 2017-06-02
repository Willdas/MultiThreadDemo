package com.multithread.demo.one.isAlive;

/*
 *  方法 idAlive() 的 功能是判断当前的线程是否处于活动状态
 */

public class Run {
	public static void main(String[] args) throws InterruptedException {
		 //thread();
		   countOperate();
	}
	public static void thread() {
		
		try {
			MyThread myThread =	 new MyThread();
			System.out.println("begin="+ myThread.isAlive());
			myThread.start();
			myThread.sleep(1000); // 线程在1秒之内已经执行完毕
			System.out.println("end="+ myThread.isAlive());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	
	public static void countOperate() {
		CountOperate countOperate = new CountOperate();
		Thread thread = new Thread(countOperate);
		System.out.println("main begin thread isAlive="+thread.isAlive());
		thread.setName("A");
		thread.start();
		System.out.println("main end thread isAlive="+thread.isAlive());
	}
}
