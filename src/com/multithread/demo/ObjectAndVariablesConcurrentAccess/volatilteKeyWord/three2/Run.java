package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.three2;

/*
 * 解决异步死循环
 * 
 * 使用volatile关键字增加了实例变量在多个线程之间的可见性.但volatile关键字最致命的缺点是不支持原子性.
 * 
 * 下面将关键字synchronized和volatile进行一下比较:
 * 1.关键字volatile是线程同步的轻量级实现,所以volatile性能肯定比synchronized要好,并且volatile只能修饰于变量，
 * 	 而synchronized可以修饰方法,以及代码块,随着JDK新版本的发布,synchronized关键字在执行效率上得到很大的提升,
 *   在开发中使用synchronized关键字的比率还是比较大的.
 * 2.多线程访问volatile不会发生阻塞,而synchronized会出现阻塞.
 * 3.volatile能保证数据的可见性,但不能保证原子性,而synchronized可以保证原子性,也可以间接的保证可见性,因为它会将
 *   私有内存和公共内存中的数据做同步
 * 4.再次重申一下,关键字volatile解决的是变量在多个线程之间的可见性,而synchronized关键字解决的是多个线程之间的访问资源的同步性.
 * 线程安全包含原子性和可见性两个方面:
 * 		java的同步机制都是围绕这两个方面来确保线程安全的.
 * 
 */
public class Run {

	public static void main(String[] args) {
		try {
			RunThread runThread = new RunThread();
			runThread.start();
			Thread.sleep(1000);
			runThread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
