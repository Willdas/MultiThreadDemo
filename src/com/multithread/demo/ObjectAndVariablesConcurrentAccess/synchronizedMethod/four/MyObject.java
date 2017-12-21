package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.four;

public class MyObject {
	
	synchronized public void methodA(){
		try {
			System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
