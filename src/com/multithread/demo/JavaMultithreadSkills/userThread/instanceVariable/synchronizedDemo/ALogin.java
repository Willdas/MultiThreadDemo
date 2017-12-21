package com.multithread.demo.JavaMultithreadSkills.userThread.instanceVariable.synchronizedDemo;

public class ALogin extends Thread{
	@Override
	public void run() {
		super.run();
		LoginServlet.doPost("a", "aa");
	}

}
