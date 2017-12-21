package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.three;

/*
 * 多个对象多个锁
 */
/*
 * 关键字synchronized取得的锁都是对象锁,而不是把一段代码或方法(函数)当做锁,所以哪个线程先
 * 执行带synchronized关键字的方法,哪个线程就是持有该方法所属对象的锁lock,那么其它线程只能呈等待状态,前提
 * 是多个线程访问的是同一个对象.
 * 
 * 但如果多个线程访问多个对象,则JVM会创建多个锁.本示例就是创建了2个HasSelfPrivateNum.java类对象,所以
 * 就会产生2个锁.
 * 
 * 同步的单词是synchronized 异步的单词是asynchronized
 */
public class Run {
		
	public static void main(String[] args) {
		HasSelfPrivateNum num1 = new HasSelfPrivateNum();
		HasSelfPrivateNum num2 = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(num1);
		threadA.start();
		ThreadB threadB = new ThreadB(num2);
		threadB.start();
	}
}
