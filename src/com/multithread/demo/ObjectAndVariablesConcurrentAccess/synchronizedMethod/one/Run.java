package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.one;


/*
 * 方法内的变量为线程安全
 * 
 */

/*
 * "非线程安全" 问题存在于"实例变量"中,如果是方法内部的私有变量，则不存在"非线程安全"问题,所得结果也就是"线程安全"的了,
 * 这是方法内部的变量是私有的特性造成的。
 */

public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum num = new HasSelfPrivateNum();
		ThreadA threadA = new ThreadA(num);
		threadA.start();
		ThreadB threadB = new ThreadB(num);
		threadB.start();
	}
}
