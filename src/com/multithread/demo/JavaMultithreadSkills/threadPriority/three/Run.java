package com.multithread.demo.JavaMultithreadSkills.threadPriority.three;

/*
 *  优先级具有随机性
 *  前面例子介绍了线程的优先级较高则优先执行完run() 方法中的任务，但这个结果不能说的太肯定，因为线程的优先级还具有
 *  “随机性”,也就是优先级较高的线程不一定每一次都先执行完。
 */

// 结论： 不要把线程的优先级与运行结果的顺序作为衡量的标准，优先级较高的线程不一定每一次都先执行完run()方法中任务，
// 也就是说，线程的优先级与打印的顺序无关，不要将这两者的关系相关联，它们的关系具有不确定性和随机性。

public class Run {
	public static void main(String[] args) throws InterruptedException{
		run1();
		
	}
	
	public static void run1() throws InterruptedException {
		for (int i = 0; i < 50; i++) {
			
			MyThread myThread = new MyThread();
			myThread.setPriority(5);
			myThread.start();
			
			MyThread2 myThread2 = new MyThread2();
			myThread2.setPriority(6);
			myThread2.start();
		}
		
		
	}
	
}
