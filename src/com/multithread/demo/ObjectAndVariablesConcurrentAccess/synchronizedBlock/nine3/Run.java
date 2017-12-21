package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.nine3;

/*
 * 静态同步synchronized 方法与synchronized(class) 代码块
 */

/*
 * 关键字synchronized还可以应用在static静态方法上,如果这样写,那是对当前的*.java文件对应的Class类进行持锁
 * 
 * 验证 Class锁可以对类的所有对象实例起作用
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
