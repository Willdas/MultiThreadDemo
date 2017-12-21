package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven5;


public class MyThread2 extends Thread {
	
	private MyOneList myOneList;

	public MyThread2(MyOneList myOneList) {
		super();
		this.myOneList = myOneList;
	}
	
	@Override
	public void run() {
		MyService myService = new MyService();
		myService.addServiceMethod(myOneList, "B");
	}
}
