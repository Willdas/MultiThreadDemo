package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.four2;

public class MyThread extends Thread {
	
	volatile public static int count;
	
	/*
	 * 注意 一定要添加static关键字
	 * 
	 * 这样synchronized与static锁的内容就是MyThread.class这个类
	 * 
	 * 也就达到同步效果
	 */
	synchronized private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("Count="+count);
	}
	@Override
	public void run() {
		addCount();
	}
}
