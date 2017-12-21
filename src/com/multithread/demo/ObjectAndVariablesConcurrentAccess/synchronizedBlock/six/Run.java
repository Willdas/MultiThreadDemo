package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.six;

/*
 * 验证同步synchronized(this)代码块是锁定当前对象的
 */
public class Run {

	public static void main(String[] args) {
		try {
			Task task = new Task();
			Mythread1 mythread1 = new Mythread1(task);
			mythread1.setName("a");
			mythread1.start();
			Thread.sleep(100);
			Mythread2 mythread2 = new Mythread2(task);
			mythread2.setName("b");
			mythread2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
