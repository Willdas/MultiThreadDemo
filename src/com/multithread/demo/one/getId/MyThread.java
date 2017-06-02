package com.multithread.demo.one.getId;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		try {
			System.out.println("run threadName==" + this.currentThread().getName() + "begin");
			Thread.sleep(2000);
			System.out.println("run threadName==" + this.currentThread().getName() + "end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
