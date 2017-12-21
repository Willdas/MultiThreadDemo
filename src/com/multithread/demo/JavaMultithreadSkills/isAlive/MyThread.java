package com.multithread.demo.JavaMultithreadSkills.isAlive;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("run方法:"+ this.isAlive());
	}

}
