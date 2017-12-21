package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.four2;

/*
 * volatile非原子的特性
 */

/*
 * 关键字volatile主要使用的场合是在多个线程中可以感知实例变量的被个更改了,并且可以获得最新的值使用,
 * 也就是用多线程读取共享变量时可以获得最新值使用.
 * 
 * 关键字volatile提示线程每次从共享内存中读取变量,而不是从私有内存中读取,这样就保证了同步数据的可见性.
 * 但在这里需要注意的是:如果修改实例变量中的数据,比如:i++;也就是i=i+1,则这样的操作其实并不是一个原子操作,也就是非线程安全.
 * 
 * 关键字volatile本身并不处理数据的原子性,而是强制对数据的读写及时影响到主内存.
 * 
 * 对于volatile修饰的变量,JVM虚拟机只是保证从主内存加载到线程工作内存的值是最新的.
 * 关键字volatile解决的是变量读时的可见性问题,但无法保证原子性,对于多个线程访问同一个实例变量还是需要加锁同步.
 * 
 */
public class Run {

	public static void main(String[] args) {
		MyThread[] myThread = new MyThread[100];
		for (int i = 0; i < 100; i++) {
			myThread[i] = new MyThread();
		}
		for (int i = 0; i < 100; i++) {
			myThread[i].start();
		}

	}

}
