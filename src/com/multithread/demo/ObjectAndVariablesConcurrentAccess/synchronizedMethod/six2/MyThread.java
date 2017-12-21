package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.six2;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
}
