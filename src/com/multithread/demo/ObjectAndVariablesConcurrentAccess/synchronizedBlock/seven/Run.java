package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven;

/*
 * 将任意对象作为对象监视器
 * 			多个线程调用同一个对象中的不同名称的synchronized同步方法或synchronized(this)同步代码块时,
 *		调用的效果就是按照顺序执行,也就是同步的,阻塞的.
 *		这说明synchronized同步方法或synchronized(this)同步代码块的调用呈阻塞状态.
 *		(1)synchronized同步方法
 *			1) 对其他synchronized同步方法或synchronized(this)同步代码块调用呈阻塞状态
 *			2) 同一时间只有一个线程可以执行synchronized同步方法中的代码
 *		(2)synchronized(this)同步代码块
 *			1) 对其他synchronized同步方法或synchronized(this)同步代码块调用呈阻塞状态
 *			2) 同一时间只有一个线程可以执行synchronized(this)同步代码块中的代码
 *		除了使用synchronized(this)格式来同步代码块,其实java还支持对"任意对象"作为"对象监视器"来实现同步的功能.
 *		这个"任意对象"大多数是实例变量及方法的参数,使用格式为synchronized(非this对象).
 *		根据前面对synchronized(this)同步代码块的作用总结可知,synchronized(非this对象)格式的作用只有1种:synchronized(非this对象)同步代码块
 *			1) 在多个线程持有"对象监视器"为同一个对象前提下,同一时间只有一个线程可以执行synchronized(非this对象)同步代码块中的代码.
 *			2) 当持有"对象监视器"为同一个对象的前提下,同一时间只有一个线程可以执行synchronized(非this对象)同步代码块中的代码.
 *		
 *		锁非this对象具有一定的优点:如果在一个类中有很多个synchronized方法,这时虽然能实现同步,但会受到阻塞,所以影响效率;但如果使用同步代码块
 *		锁非this对象,则synchronized(非this)代码块中的程序与同步方法是异步的,不与其他锁this同步方法争抢this锁,则可以大大提高运行效率.
 *
 */

public class Run {
	
	public static void main(String[] args) {
		
		Service service = new Service();
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadB.start();
		
	}
}
