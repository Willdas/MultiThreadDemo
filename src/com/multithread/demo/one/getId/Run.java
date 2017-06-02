package com.multithread.demo.one.getId;

/*
 * getId() 方法 的作用是取得线程的唯一标识。
 */

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = Thread.currentThread();
		
		// 线称名称叫 main 线程id
		System.out.println(thread.getName() + "-->" + thread.getId());
		
	}
}
