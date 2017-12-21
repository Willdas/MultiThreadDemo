package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven5;


public class MyThread1 extends Thread {
	
	private MyOneList myOneList;

	public MyThread1(MyOneList myOneList) {
		super();
		this.myOneList = myOneList;
	}
	
	@Override
	public void run() {
		MyService myService = new MyService();
		myService.addServiceMethod(myOneList, "A");
	}
	
}
