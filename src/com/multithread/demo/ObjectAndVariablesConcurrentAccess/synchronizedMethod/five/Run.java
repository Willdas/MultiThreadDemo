package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.five;

/*
 * 脏读
 */

/*
 * 当A线程调用anyObject对象加入synchronized关键字的X方法时,A线程就获得了X方法锁,
 * 更准确的说,是获得了对象的锁,所以其它线程必须等A线程执行完毕
 * 才可以调用X方法,但B线程可以随意调用其它的非synchronized同步方法
 * 
 * 当A线程调用anyObject对象加入synchronized关键字的X方法时,A线程就获得了X方法所在对象的锁,所以其它线程必须等A线程执行完毕才可以调用X方法,
 * 而B线程如果调用申明了synchronized关键字的非X方法时,必须等A线程将X方法执行完,也就是释放对象锁后才可以调用,这时A线程已经执行了一个完整的
 * 任务,也就是说username和password这两个实例变量已经同时被赋值,不存在脏读的基本环境.
 * 
 * 
 *注: 脏读一定会出现在操作实例变量的情况下,这就是不同线程"争抢"实例变量的结果.
 * 
 * 
 */

public class Run {
	
	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			ThreadA threadA = new ThreadA(publicVar);
			threadA.start();
			Thread.sleep(2000); //打印结果受此值大小影响
			publicVar.getValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
