package com.multithread.demo.one.stopThread.six;

public class MyThread extends Thread{
	int i = 0;
	@Override
	public void run() {
		try {
			this.stop();
		} catch (ThreadDeath e) {
			System.out.println("进入 catch() 方法了");
			e.printStackTrace();
		}
	}

}
