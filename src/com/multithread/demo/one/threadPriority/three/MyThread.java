package com.multithread.demo.one.threadPriority.three;

import java.util.Random;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10; i++) {
			Random random = new Random();
			random.nextInt();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("thread1 use time= " + (endTime - beginTime));
	}

}
