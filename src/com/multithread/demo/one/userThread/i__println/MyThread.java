package com.multithread.demo.one.userThread.i__println;

public class MyThread extends Thread{
	
	private int i = 5;
	
	// 去掉 synchronized 关键字 测试数据出现错误
	@Override
	synchronized public void run() {  
		System.out.println("i="+(i--) + " threadName" + Thread.currentThread().getName());
		// 代码 i-- 由前面项目中单独一行运行改成在当前项目中在println() 方法中 直接进行打印的
	}

}
