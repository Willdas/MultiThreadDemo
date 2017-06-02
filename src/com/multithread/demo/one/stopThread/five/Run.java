package com.multithread.demo.one.stopThread.five;

/*
 * 能停止的线程 暴力停止
 */


public class Run {
	public static void main(String[] args){
		run1();
		
	}
	
	public static void run1() {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
