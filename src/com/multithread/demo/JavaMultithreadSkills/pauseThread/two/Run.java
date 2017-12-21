package com.multithread.demo.JavaMultithreadSkills.pauseThread.two;

/*
 * 暂停线程意味着线程还可以继续运行，在java多线程中，可以使用suspend方法暂停线程，使用resume()方法恢复线程的执行
 */

/*
 * suspeng 和 resume 的缺点——独占
 */


// 在使用suspend与resume方法时，如果使用不当，极易造成公共的同步对象的独占，使得其他线程无法访问公共同步对象。

public class Run {
	public static void main(String[] args) throws InterruptedException{
		//run1();
		run2();
	}
	
	public static void run1() throws InterruptedException {
		final MyThread myThread = new MyThread();
		Thread thread = new Thread(){
			@Override
			public void run() {
				myThread.printString();
			}
		};
		thread.setName("a");
		thread.start();
		thread.sleep(1000);
		Thread thread2 = new Thread(){
			@Override
			public void run() {
				System.out.println("thread2 启动了，但进入不了printString() 方法！ 只打印1个begin");
				System.out.println("因为printString() 方法被a线程锁定并永远suspend 暂停了!");
				myThread.printString();
			}
		};
		thread2.start();
	}
	
	// 另一种独占锁的情况也要格外注意
	public static void  run2() throws InterruptedException {
		MyThread2 thread = new MyThread2();
		thread.start();
		thread.sleep(1000);
		System.out.println(" main end");

	}
}
