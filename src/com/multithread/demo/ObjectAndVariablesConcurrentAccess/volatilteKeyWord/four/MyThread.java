package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.four;

public class MyThread extends Thread {
	
	volatile public static int count;
	
	private static void addCount() {
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
