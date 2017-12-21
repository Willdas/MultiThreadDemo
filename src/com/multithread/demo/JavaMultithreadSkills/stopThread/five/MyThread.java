package com.multithread.demo.JavaMultithreadSkills.stopThread.five;

public class MyThread extends Thread{
	int i = 0;
	@Override
	public void run() {
		
		super.run();
		try {
			while (true) {
				i++;
				System.out.println("i="+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
