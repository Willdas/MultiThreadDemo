package com.multithread.demo.JavaMultithreadSkills.stopThread.seven;

/*
 * 释放锁的不良后果
 */

/*
 * stop() 方法 已废弃 不建议使用stop()方法
 */

public class Run {
	public static void main(String[] args){
		run1();
		
	}

	private static void run1() {
		try {
			SynchronizedObject synchronizedObject = new SynchronizedObject();
			MyThread thread = new MyThread(synchronizedObject);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(synchronizedObject.getUsername() + "--" + synchronizedObject.getPassword());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
