package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight2;

/*
 * 细化验证3个结论
 */

/*
 * 2)当其他线程执行x对象中的synchronized同步方法时呈同步效果;
 */
public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyObject myObject = new MyObject();
			ThreadA threadA = new ThreadA(service,myObject);
			threadA.setName("A");
			threadA.start();
			Thread.sleep(100);
			ThreadB threadB = new ThreadB(myObject);
			threadB.setName("B");
			threadB.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
