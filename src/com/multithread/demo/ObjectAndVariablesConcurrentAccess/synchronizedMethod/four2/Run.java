package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.four2;


/*
 * 本示例是两个线程访问同一个对象的两个同步的方法.
 */

/*
 *1.A线程先持有object对象的Lock锁,B线程可以以异步的方式调用object对象中的非synchroniezd类型的方法
 *2.A线程先持有object对象的Lock锁,B线程如果在这时调用object对象中的synchronized类型的方法则需等待,也就是同步.
 */
public class Run {

	public static void main(String[] args) {
		MyObject myObject = new MyObject();
		ThreadA threadA = new ThreadA(myObject);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(myObject);
		threadB.setName("B");
		threadB.start();
	}
	
}
