package com.multithread.demo.one.stopThread.eight;

/*
 * 使用 return  停止线程
 */


// 将方法 interrupt() 与 return 结合使用也能实现停止线程的效果

// 建议使用“抛异常” 的方法来实现线程的停止，因为在catch 块中还可以将异常往上抛，使线程停止事件得以传播 

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
		
		MyThread thread = new MyThread();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
		
	}
	
}
