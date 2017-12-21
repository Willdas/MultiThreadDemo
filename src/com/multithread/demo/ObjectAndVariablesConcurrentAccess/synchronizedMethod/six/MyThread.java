package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.six;

public class MyThread extends Thread{
	@Override
	public void run() {
		Service service = new Service();
		service.service1();
	}
}
