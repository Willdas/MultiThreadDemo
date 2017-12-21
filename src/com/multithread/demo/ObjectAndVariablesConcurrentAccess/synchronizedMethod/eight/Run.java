package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.eight;

/*
 * 同步不具有继承性
 * 
 * 多个线程调用子类方法时,不能保证线程同步
 * 
 * 需要在子类的方法上加synchronized关键字 才可以保证线程同步
 */
public class Run {
	
	public static void main(String[] args) {
		Sub sub = new  Sub();
		
		MyThreadA threadA = new MyThreadA(sub);
		threadA.setName("A");
		threadA.start();
		
		MyThreadB threadB = new MyThreadB(sub);
		threadB.setName("B");
		threadB.start();
	}
}
