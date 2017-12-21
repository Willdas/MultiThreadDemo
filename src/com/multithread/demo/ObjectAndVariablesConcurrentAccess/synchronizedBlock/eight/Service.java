package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight;

public class Service {
	
	public void testMethod1(MyObject myObject){
		synchronized (myObject) {
			try {
				System.out.println("testMethod1__getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("testMethod1 releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
