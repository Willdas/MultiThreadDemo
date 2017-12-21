package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.one;


/*
 * 同步语句块:
 * 		用关键字synchronized声明方法的某些情况下是有弊端的,比如A线程调用同步方法执行一个长时间的任务,那么B线程
 *	    则必须等待比较长的时间,在这样的情况下可以使用synchronized同步语句块来解决.
 *
 * 此例子来说明synchronized方法带来的弊端
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
