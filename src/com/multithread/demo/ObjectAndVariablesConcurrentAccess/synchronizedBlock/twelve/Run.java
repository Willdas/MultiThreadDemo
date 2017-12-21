package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.twelve;

/*
 * 多线程的死锁
 */

/*
 * Java线程死锁是一个经典的多线程问题,因为不同的线程都在等待根本不可能被释放的锁,从而导致所有的任务都无法继续
 * 完成.在多线程技术中,"死锁"是必须避免的,因为这会造成线程的"假死"
 * 
 * 使用JDK自带工具检测死锁：
 * 	1.首先进入cmd窗口,再次进入jdk安装目录下的bin目录下
 *  2.输入jps,回车,得到Run的id值
 *  3.jstack -l id值  
 *  4.在末尾处可以看到死锁的信息
 */
public class Run {

	public static void main(String[] args) {
		try {
			DealThread dealThread1 = new DealThread();
			dealThread1.setFlag("a");
			Thread thread1 = new Thread(dealThread1);
			thread1.start();
			Thread.sleep(100);
			
			dealThread1.setFlag("b");
			Thread thread2 = new Thread(dealThread1);
			thread2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
