package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven2;

/*
 *	使用"synchronized(非this对象x)同步代码块"格式化进行同步操作时,对象监视器必须是同一个对象.如果不是同一个
 *	监视器,运行的结果就是异步调用了,就会出现交叉运行.
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
