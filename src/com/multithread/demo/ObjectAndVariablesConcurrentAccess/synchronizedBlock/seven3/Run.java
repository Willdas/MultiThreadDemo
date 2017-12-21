package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven3;

/*
 *	使用"synchronized(非this对象x)同步代码块"格式时,持有不同的对象监视器是异步的效果.
 *	也就是说:synchronized(非this对象)与同步synchronized方法是异步调用的效果.
 *
 *	由于对象监视器不同,所以运行结果就是异步的.
 *	同步代码块放在非同步synchronized方法中进行声明,并不能保证调用方法的线程的执行同步/顺序读,也就是
 *	线程调用的顺序是无序的,虽然在同步块中执行的顺序是同步的,这样极易出现"脏读"问题.
 *	解决方式:
 *		使用"synchronized(非this对象x)同步代码块"格式也可以解决"脏读"问题.
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
