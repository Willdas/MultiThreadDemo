package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.seven2;

public class Service {
	private boolean isContinueRun = true;
	
	public void runMethod(){
		String anyString = new String();
		while (isContinueRun == true) {
			synchronized (anyString) {
				
			}
		}
		System.out.println("停下来了");
	}
	
	public void stopMethod(){
		isContinueRun = false;
	}
}
