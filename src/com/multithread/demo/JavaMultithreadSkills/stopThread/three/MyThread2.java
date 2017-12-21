package com.multithread.demo.JavaMultithreadSkills.stopThread.three;

public class MyThread2 extends Thread{
	
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("已经是停止状态 开始退出");
					throw new InterruptedException();
				}
				System.out.println("i="+(i+1));
			}
			System.out.println("如果代码还在执行，线程并未停止");
		} catch (InterruptedException e) {
			System.out.println("进 catch 方法");
			e.printStackTrace();
		}
	}

}
