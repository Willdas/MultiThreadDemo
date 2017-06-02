package com.multithread.demo.one.stopThread.three;

public class MyThread1 extends Thread{
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("已经是停止状态 开始退出");
				break;
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("如果代码还在执行，线程并未停止");
	}

}
