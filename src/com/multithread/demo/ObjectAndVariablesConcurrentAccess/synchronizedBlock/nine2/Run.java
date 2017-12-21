package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.nine2;

/*
 * 静态同步synchronized 方法与synchronized(class) 代码块
 */

/*
 * 关键字synchronized还可以应用在static静态方法上,如果这样写,那是对当前的*.java文件对应的Class类进行持锁
 * 
 *验证synchronized加到静态方法上和synchronized加到非静态方法上 不是同一个锁
 *	
 *出现异步的原因:因为持有不同的锁,一个是对象锁,一个是Class锁,而Class锁可以对类的所有对象实例起作用
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
		ThreadC threadC = new ThreadC(service);
		threadC.setName("C");
		threadC.start();
	}
	
}
