package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.seven2;

/*
 * synchronized代码块有volatile同步的功能
 */

/*
 * 解决方式:使用synchronized同步代码块  
 * 
 * synchronized可以保证在同一时刻,只有一个线程可以执行某一个方法或某一个代码块.
 * 它包含两个特征:互斥性和可见性.
 * 同步synchronized不仅可以解决一个线程看到的对象处于不一致的状态,还可以保证进入同步方法或者
 * 同步代码块的每个线程,都看到由同一个锁保护之前所有的修改效果.
 */
public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA threadA = new ThreadA(service);
			threadA.start();
			Thread.sleep(1000);
			ThreadB threadB = new ThreadB(service);
			threadB.start();
			System.out.println("已经发出停止的命令了");  //出现死循环
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
