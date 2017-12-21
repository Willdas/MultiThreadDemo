package com.multithread.demo.JavaMultithreadSkills.stopThread.six;

/*
 * stop() 方法 与 java.lang.ThreadDeath 异常
 */



/*
 * 调用stop()方法会抛出java.lang.ThreadDeath异常，通常情况下，此异常不需要显示的捕捉。
 * 方法 stop() 已经作废，因为如果强制让线程停止则有可能使一些清理性的工作得不到完成，
 * 另外一个情况是对锁定的对象进行了"解锁"，导致数据得不到同步的处理，出现数据不一致问题
 */

public class Run {
	public static void main(String[] args){
		run1();
		
	}
	
	public static void run1() {
		MyThread thread = new MyThread();
		thread.start();
	}
	
}
