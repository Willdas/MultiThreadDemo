package com.multithread.demo.one.pauseThread.three;

/*
 * 暂停线程意味着线程还可以继续运行，在java多线程中，可以使用suspend方法暂停线程，使用resume()方法恢复线程的执行
 */

/*
 * suspeng 和 resume 的缺点——不同步
 */


// 在使用suspend与resume方法时，容易出现因为线程的暂停而导致的数据不同步的情况

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
		final MyThread myThread = new MyThread();
		Thread thread = new Thread(){
			@Override
			public void run() {
				myThread.setValue("a", "aa");
			}
		};
		thread.setName("a");
		thread.start();
		thread.sleep(500);
		Thread thread2 = new Thread(){
			@Override
			public void run() {
				myThread.printUsernamePassword();
			}
		};
		thread2.start();
	}
	
}
