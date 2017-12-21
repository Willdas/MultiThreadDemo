package com.multithread.demo.JavaMultithreadSkills.stopThread.eight;

public class MyThread extends Thread{
	int i = 0;
	@Override
	public void run() {
		while (true) {
			if (this.interrupted()) {
				System.out.println("停止了");
				return;
			}
			System.out.println("timer="+System.currentTimeMillis());
		}
	}

}
