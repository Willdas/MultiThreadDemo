package com.multithread.demo.one.userThread.instanceVariable;

// (1) 不共享数据
public class MyThread1 extends Thread{
	
	int num = 5;
	
	public MyThread1(String name) {
		super();
		this.setName(name);  // 设置线程名称
		
	}

	@Override
	public void run() {
		while (num > 0) {
			num--;
			System.out.println("由"+this.currentThread().getName() + "计算.num="+num);
		}
	}
}
