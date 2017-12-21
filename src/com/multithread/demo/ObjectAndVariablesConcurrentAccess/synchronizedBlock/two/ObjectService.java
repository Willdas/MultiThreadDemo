package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.two;

public class ObjectService {
	
	public void serviceMethod(){
		try {
			synchronized (this) {
				System.out.println("begin time=" + System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("end time=" + System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
