package com.multithread.demo.JavaMultithreadSkills.threadPriority.four;


public class MyThread extends Thread{
	
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
