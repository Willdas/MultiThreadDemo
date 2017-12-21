package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven4;

import java.util.List;

public class MyThreadB extends Thread {
	
	private MyList myList;

	public MyThreadB(MyList myList) {
		super();
		this.myList = myList;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			myList.add("threadB" + (i+1));
		}
	}
}
