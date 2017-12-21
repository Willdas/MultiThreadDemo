package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.six2;

/*
 * 原子类也并不完全安全
 */

/*
 * 解决方式:加上synchronized
 */
public class Run {

	public static void main(String[] args) {
		try {
			MySerive mySerive = new MySerive();
			MyThread[] myThread = new MyThread[5];
			for (int i = 0; i < myThread.length; i++) {
				myThread[i] = new MyThread(mySerive);
			}
			for (int i = 0; i < myThread.length; i++) {
				myThread[i].start();
			}
			Thread.sleep(1000);
			System.out.println(mySerive.atomicLong.get());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
