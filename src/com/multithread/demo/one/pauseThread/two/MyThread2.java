package com.multithread.demo.one.pauseThread.two;

public class MyThread2 extends Thread{
	private long i = 0;
	
	@Override
	public void run() {
		while (true) {
			i++;
			// 加上这句话 控制条不在打印 main end 
			// 原因：当程序运行到println() 方法内部停止时，同步锁未被释放
			//System.out.println("i="+i);  
		}
	}
}
