package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.seven;

/*
 * 在运行后,a线程异常并释放锁,线程b进入方法正常打印
 * 结论就是出现异常,锁自动释放.
 */
public class Run {
	
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA threadA = new ThreadA(service);
			threadA.setName("a");
			threadA.start();
			Thread.sleep(500);
			ThreadB threadB = new ThreadB(service);
			threadB.setName("b");
			threadB.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
