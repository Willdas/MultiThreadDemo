package com.multithread.demo.one.threadPriority.two;

import java.util.Random;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		long addResult = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5000; j++) {
				Random random = new Random();
				random.nextInt();
				addResult  = addResult + i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("thread1 use time= " + (endTime - beginTime));
	}

}
