package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.sixteen;

/*
 * 锁对象的改变
 */


/*
 * 在将任何数据类型作为同步锁时,需要注意的是,是否有多个线程同时持有锁对象,如果同时持有相同的锁对象,
 * 则这些线程之间就是同步的,如果分别获得锁对象,这些线程之间就是异步的.
 * 
 * 50毫秒后B取得锁的是456
 */
public class Run1 {

	public static void main(String[] args) {
		try {
			MyService myService = new MyService();
			ThreadA threadA = new ThreadA(myService);
			threadA.setName("A");
			ThreadB threadB = new ThreadB(myService);
			threadB.setName("B");
			threadA.start();
			Thread.sleep(50); //存在50毫秒
			threadB.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
