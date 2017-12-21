package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.ten2;


/*
 * 数据类型String的常量池特性
 */

/*
 * 大多数情况下，同步synchronized代码块都不能使用String作为锁对象,而是改用其他.
 * 比如new Object()实例化一个Object对象,但它并不放入缓存中.这样持有的锁不是一个
 * 
 */
public class Run {
	
	public static void main(String[] args) {
		Service service = new Service();
		ThreadA threadA = new ThreadA(service); 
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service); 
		threadB.setName("B");
		threadB.start();
	}
}
