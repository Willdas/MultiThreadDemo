package com.multithread.demo.one.pauseThread.two;

public class MyThread{
	synchronized public void printString(){
		System.out.println("begin");
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println("a 线程永远 suspend! ");
			Thread.currentThread().suspend();
		}
		System.out.println("end");
		
	}
}
