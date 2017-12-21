package com.multithread.demo.JavaMultithreadSkills.userThread.extendThread;

public class MyThread2 extends Thread{
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int)(Math.random() * 10);
				Thread.sleep(time);
				System.out.println("run="+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
