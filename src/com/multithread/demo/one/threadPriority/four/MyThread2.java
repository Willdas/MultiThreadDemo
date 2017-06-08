package com.multithread.demo.one.threadPriority.four;


public class MyThread2 extends Thread{
	
private int count = 0;
	
	public int getCount() {
		return count;
	}

	@Override
	public void run() {
		while (true) {
			count ++;	
		}
	}


}
