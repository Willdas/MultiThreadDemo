package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.fifteen;

import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.fifteen.OutClass.InnerClass1;
import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.fifteen.OutClass.InnerClass2;

/*
 * 内置类与同步:实验2
 * 此案例中,同步代码块synchronized(class2)对class2上锁后,其它线程只能以同步的方式调用class2中的静态同步方法.
 */
public class Run {

	public static void main(String[] args) {
		final InnerClass1 innerClass1 = new InnerClass1();
		final InnerClass2 innerClass2 = new InnerClass2();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				innerClass1.method1(innerClass2);
			}
		}, "T1");
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				innerClass1.method2();
			}
		}, "T2");
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				innerClass2.method1();
			}
		}, "T3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
