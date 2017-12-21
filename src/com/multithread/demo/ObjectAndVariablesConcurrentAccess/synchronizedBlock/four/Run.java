package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.four;

/*
 * 一半同步,一半异步
 * 		不在synchronized块中的就是异步代码,在synchronized中的就是同步代码
 */
public class Run {

	public static void main(String[] args) {
		
		Task task = new Task();
		Mythread1 mythread1 = new Mythread1(task);
		mythread1.setName("a");
		mythread1.start();
		Mythread2 mythread2 = new Mythread2(task);
		mythread2.setName("b");
		mythread2.start();
		
	}

}
