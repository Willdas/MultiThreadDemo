package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.nine4;

/*
 * 静态同步synchronized 方法与synchronized(class) 代码块
 */

/*
 * 同步synchronized(class)代码块的作用其实和synchronized static 方法的作用一样.
 *
 */
public class Run {
	
	public static void main(String[] args) {
		Service service1 = new Service();
		Service service2 = new Service();
		ThreadA threadA = new ThreadA(service1);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(service2);
		threadB.setName("B");
		threadB.start();
	}
	
}
