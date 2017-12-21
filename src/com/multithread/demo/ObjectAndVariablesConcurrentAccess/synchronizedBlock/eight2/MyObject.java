package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight2;

public class MyObject {
	
	synchronized public void speedPrintString(){
		System.out.println("speedPrintString__getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
		System.out.println("-----------------------------");
		System.out.println("speedPrintString  releaseLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
	}
}
