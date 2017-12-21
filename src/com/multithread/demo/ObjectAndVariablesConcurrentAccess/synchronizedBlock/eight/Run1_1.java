package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight;

/*
 * 细化验证3个结论
 */

/*
 * 1)当多线程同时执行synchronized(x){} 同步代码块时呈同步效果;
 * 
 * 同步的原因:使用的是同一个"对象监视器"
 */
public class Run1_1 {

	public static void main(String[] args) {
		Service service = new Service();
		MyObject myObject = new MyObject();
		ThreadA threadA = new ThreadA(service,myObject);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(service,myObject);
		threadB.setName("B");
		threadB.start();

	}

}
