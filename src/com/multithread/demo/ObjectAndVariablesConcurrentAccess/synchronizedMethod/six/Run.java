package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.six;


/*
 * synchronized 锁重入
 * 
 * 关键字synchronized拥有锁重入的功能,也就是在使用synchronized时,当一个线程得到一个对象锁后,再次
 * 请求此对象锁时是可以再次得到该对象的锁的.这也证明在一个synchronized方法/块的内部调用本类的其它
 * synchronized方法/块时,是永远可以得到锁的.
 * 
 */

/*
 * 可重入锁的概念:
 * 	自己可以再次获取自己的内部锁.
 *  比如有1条线程获得了某个对象的锁,此时这个对象锁还没有释放,当其再次想要获得这个对象的锁的时候还是可以
 *  获取的,如果不可重入的话,就会造成死锁.
 *  
 *  可重入锁也支持在父类继承的环境中.
 */
public class Run {
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
