package com.multithread.demo.one.userThread.instanceVariable.synchronizedDemo;

public class BLogin extends Thread{
	@Override
	public void run() {
		super.run();
		LoginServlet.doPost("b", "bb");
	}

}
