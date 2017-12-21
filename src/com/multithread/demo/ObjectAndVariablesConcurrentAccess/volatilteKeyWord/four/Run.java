package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.four;

/*
 * volatile非原子的特性
 */

/*
 * 关键字volatile虽然增加了实例变量在多个线程之间可见性,但它却不具备同步性,那么也就不具备原子性.
 */
public class Run {

	public static void main(String[] args) {
		MyThread[] myThread = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			myThread[i] = new MyThread();
			
		}
		for (int i = 0; i < 100; i++) {
			myThread[i].start();
		}

	}

}
