package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.ten2;

public class Service {
	
	public static void print(Object object){
		try {
			synchronized (object) {
				while(true){
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
