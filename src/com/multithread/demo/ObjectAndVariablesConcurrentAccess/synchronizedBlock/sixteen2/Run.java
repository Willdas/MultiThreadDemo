package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.sixteen2;

/*
 * 锁对象的改变
 */


/*
 * 在将任何数据类型作为同步锁时,需要注意的是,是否有多个线程同时持有锁对象,如果同时持有相同的锁对象,
 * 则这些线程之间就是同步的,如果分别获得锁对象,这些线程之间就是异步的.
 * 
 * 只要对象不变,即使对象的属性被改变,运行的结果还是同步
 */
public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			UserInfo userInfo = new UserInfo();
			ThreadA threadA = new ThreadA(service,userInfo);
			threadA.setName("A");
			threadA.start();
			Thread.sleep(50);
			ThreadB threadB = new ThreadB(service,userInfo);
			threadB.setName("B");
			threadB.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
