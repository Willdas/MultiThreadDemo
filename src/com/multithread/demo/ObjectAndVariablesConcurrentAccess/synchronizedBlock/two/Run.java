package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.two;

/*
 * synchronized同步代码块的使用
 *		当两个并发线程访问同一个对象object的synchronized(this)同步代码块时,一段时间内只有一个线程
 *		被执行,另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块.
 *
 * 此例子虽然使用的synchronized同步代码块,但执行的效率还是没有提高,执行的效果还是同步运行的.
 */
public class Run {
	
	public static void main(String[] args) {
	
		ObjectService objectService = new ObjectService();
		ThreadA threadA = new ThreadA(objectService);
		threadA.setName("a");
		threadA.start();
		ThreadB threadB = new ThreadB(objectService);
		threadB.setName("b");
		threadB.start();
	}
}
