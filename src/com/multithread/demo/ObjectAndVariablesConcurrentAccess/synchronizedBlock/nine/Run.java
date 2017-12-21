package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.nine;

/*
 * 静态同步synchronized 方法与synchronized(class) 代码块
 */

/*
 * 关键字synchronized还可以应用在static静态方法上,如果这样写,那是对当前的*.java文件对应的Class类进行持锁
 * 
 * 区别:
 * 	synchronized加到静态方法上和synchronized加到非静态方法上的区别
 * 		synchronized关键字加到static静态方法上是给Class类上锁,而synchronized关键字加到非static静态方法上是给对象上锁.
 */
public class Run {
	
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB();
		threadB.setName("B");
		threadB.start();
	}
	
}
