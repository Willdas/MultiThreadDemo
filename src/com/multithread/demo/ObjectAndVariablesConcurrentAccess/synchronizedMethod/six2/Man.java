package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.six2;

public class Man {
	
	public int i = 10;
	
	synchronized public void operateIMainMethod(){
		try {
			i--;
			System.out.println("main print i=" + i);
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
