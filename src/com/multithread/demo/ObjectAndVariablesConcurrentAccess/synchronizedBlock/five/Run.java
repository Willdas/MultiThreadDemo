package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.five;

/*
 * synchronized代码块间的同步性
 * 		在使用同步synchronized(this)代码块时需要注意的是,当一个线程访问object的一个synchronized(this)同步
 * 		代码块时,其它线程对同一个object中所有其它synchronized(this)同步代码块的访问将被阻塞,
 * 		这说明synchronized使用的是一个"对象监视器".
 * 
 */
public class Run {
	
	public static void main(String[] args) {
		ObjectService objectService = new ObjectService();
		ThreadA threadA = new ThreadA(objectService);
		threadA.start();
		ThreadB threadB = new ThreadB(objectService);
		threadB.start();
	}
}
