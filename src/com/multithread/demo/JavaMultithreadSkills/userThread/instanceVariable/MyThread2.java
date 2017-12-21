package com.multithread.demo.JavaMultithreadSkills.userThread.instanceVariable;


// (2) 共享数据
public class MyThread2 extends Thread{
	
	private int num = 5;

	@Override
	synchronized public void run() {  //  线程同步  加锁部分 称为 互斥去或临界区
		super.run();
		num--;
		System.out.println("由"+this.currentThread().getName() + "计算.num="+num);
	}
}
