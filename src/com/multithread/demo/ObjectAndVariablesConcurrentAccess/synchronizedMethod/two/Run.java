package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.two;

/*
 * 实例变量非线程安全
 */

/*
 *  如果多个线程共同访问1个对象中的实例变量,则有可能出现"非线程安全"问题。
 * 
 *  在两个线程访问同一个对象中的同步方法时一定是线程安全的。
 */


public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum hasSelfPrivateNumb = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(hasSelfPrivateNumb);
		ThreadB threadB = new ThreadB(hasSelfPrivateNumb);
		threadA.start();
		threadB.start();
	}
}
