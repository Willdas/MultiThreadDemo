package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.three;


/*
 * 用同步代码块解决同步方法的弊端
 * 			当一个线程访问object中的一个synchronized同步代码块时,另一个线程仍然可以访问该object对象中的
 * 		非synchronized(this)同步代码块
 * 			虽然用时缩短,运行效率加快,但同步synchronized代码块真的同步吗？真的持有当前调用的对象的锁吗?
 * 		答案为是.
 */
	
public class Run {

	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 thread1 = new MyThread1(task);
		thread1.start();
		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long beginTime = CommonUtils.beginTime1;
		if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
			beginTime = CommonUtils.beginTime2;
		}
		long endTime = CommonUtils.endTime1;
		if (CommonUtils.endTime2 > CommonUtils.endTime1) {
			endTime = CommonUtils.endTime2;
		}
		System.out.println("耗时: " + ((endTime -beginTime) / 1000));
	}

}
