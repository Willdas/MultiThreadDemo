package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.four2;

public class MyObject {
	
	synchronized public void methodA(){
		try {
			System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end time=" + System.currentTimeMillis());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//如果不加synchronized关键字 B线程可以以异步的方式调用此方法
	synchronized public void methodB(){
		try {
			System.out.println("begin methodB threadName= " + Thread.currentThread().getName() + " begin time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
