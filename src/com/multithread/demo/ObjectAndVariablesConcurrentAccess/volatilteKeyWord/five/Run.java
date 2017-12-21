package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.five;

/*
 * 使用原子类进行i++操作
 */

/*
 * 在操作i++时除了使用synchronized关键字之外,还可以使用AtomicInteger原子类进行实现
 * 
 * 原子操作时不可分割的整体,没有其他线程能够中断或者检查正在原子操作中的变量.一个原子(atomic)
 * 类型就是一个原子操作可用的类型,它可以在没有锁的情况下做到线程安全(thread-safe)
 * 
 * 
 */
public class Run {

	public static void main(String[] args) {
		AddCountThread addCountThread = new AddCountThread();
		Thread thread1 = new Thread(addCountThread);
		thread1.start();
		Thread thread2 = new Thread(addCountThread);
		thread2.start();
		Thread thread3 = new Thread(addCountThread);
		thread3.start();
		Thread thread4 = new Thread(addCountThread);
		thread4.start();
		Thread thread5 = new Thread(addCountThread);
		thread5.start();
	}

}
