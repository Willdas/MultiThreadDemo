package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.ten;


/*
 * 数据类型String的常量池特性
 */

/*
 * 将synchronized(sting) 同步块与String联合使用时,要注意常量池以带来的一些例外
 * 
 * 出现此情况的原因:String的两个值都是AA,两个线程持有相同的锁,所以造成B不能执行.这就是String常量池锁带来的问题.
 * 因此大多数情况下，同步synchronized代码块都不能使用String作为锁对象,而是改用其他.
 * 比如new Object()实例化一个Object对象,但它并不放入缓存中.
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
