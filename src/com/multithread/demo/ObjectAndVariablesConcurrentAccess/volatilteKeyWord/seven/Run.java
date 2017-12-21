package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.seven;

/*
 * synchronized代码块有volatile同步的功能
 */

/*
 * 关键字synchronized可以使用多个线程访问同一个资源具有同步性,而且它还具有将线程工作内存中的
 * 私有变量与公共内存中的变量同步的功能.
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
