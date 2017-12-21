package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.fourteen;

import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.fourteen.OutClass.Inner;

/*
 * 内置类与同步:实验1
 */

/*
 * 此案例中有两个同步方法,但使用的却是不同的锁(也就是不同的"对象监视器") 结果也是异步(乱序)
 */
public class Run {

	public static void main(String[] args) {
		final Inner inner = new Inner();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner.method1();
			}
		}, "A");
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner.method2();
			}
		}, "B");
		thread1.start();
		thread2.start();

	}
}
