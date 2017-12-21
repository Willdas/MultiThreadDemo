package com.multithread.demo.JavaMultithreadSkills.userThread.instanceVariable.synchronizedDemo;

// 解决非线程安全问题
public class Run {
	public static void main(String[] args) {
		
		ALogin aLogin = new ALogin();
		aLogin.start();
		
		BLogin bLogin = new BLogin();
		bLogin.start();
	}
}
