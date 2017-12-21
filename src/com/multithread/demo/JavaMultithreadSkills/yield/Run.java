package com.multithread.demo.JavaMultithreadSkills.yield;

/*
 * yield() 方法 的作用是放弃当前的CPU资源，将它让其他的任务去占用CPU执行时间，但放弃的时间不确定，有可能刚刚放弃，马上有获得CPU时间片
 */

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.start();
		
	}
	
}
