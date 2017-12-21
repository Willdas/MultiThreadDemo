package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.four;


/*
 * synchronized 方法与锁对象 证明上一节讲述的线程锁的是对象
 */
/*
 * 调用关键字synchronized申明的方法一定是排队运行的。另外需要牢牢记住"共享"这两个字,
 * 注：只有共享资源的读写访问才需要同步化,如果不是共享资源,那么根本就没有同步的必要.
 * 
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
