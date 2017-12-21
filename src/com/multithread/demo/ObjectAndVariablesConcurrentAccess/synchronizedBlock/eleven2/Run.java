package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eleven2;

/*
 * 同步synchronized方法无限等待与解决
 */

/*
 * 同步方法容易造成死循环 
 * 解决方式:使用同步块来解决
 * 
 * B线程永远得不到运行的机会,锁死了
 */

public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		ThreadA threadA = new ThreadA(service);
		threadA.start();
		ThreadB threadB = new ThreadB(service);
		threadB.start();
	}

}
