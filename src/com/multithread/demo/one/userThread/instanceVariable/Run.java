package com.multithread.demo.one.userThread.instanceVariable;

/*
 * 实例变量与线程安全
 */
public class Run {
	public static void main(String[] args) {
		//thread1();
		thread2();
		
	}
	// (1) 不共享数据
	@SuppressWarnings("unused")
	private static void thread1() {
		MyThread1 A = new MyThread1("A");
		MyThread1 B = new MyThread1("B");
		MyThread1 C = new MyThread1("C");

		A.start();
		B.start();
		C.start();
	}

	// (2) 共享数据
	@SuppressWarnings("unused")
	private static void thread2() {
		MyThread2 thread2 = new MyThread2();
		Thread A = new Thread(thread2, "A");
		Thread B = new Thread(thread2, "B");
		Thread C = new Thread(thread2, "C");
		Thread D = new Thread(thread2, "D");
		Thread E = new Thread(thread2, "E");

		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
	}
}
