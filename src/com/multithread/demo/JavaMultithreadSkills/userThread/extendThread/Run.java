package com.multithread.demo.JavaMultithreadSkills.userThread.extendThread;

// 继承 Thread类 
public class Run {
	public static void main(String[] args) {
		thread1();
		//thread2();
		//thread3();
	}
	
	public static void thread1() {
		MyThread1 thread = new MyThread1();
		thread.start();
		System.out.println("运行结束");
	}
	
	// 测试线程随机性
	public static void thread2() {
		try {
			MyThread2 thread = new MyThread2();
			thread.setName("mythread2");
			thread.start();
			for (int i = 0; i < 10; i++) {
				int time = (int)(Math.random() * 10);
				Thread.sleep(time);
				System.out.println("main="+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// 执行start()方法不代表线程启动的顺序
	public static void thread3(){
		MyThread3 t1 = new MyThread3(1);
		MyThread3 t2 = new MyThread3(2);
		MyThread3 t3 = new MyThread3(3);
		MyThread3 t4 = new MyThread3(4);
		MyThread3 t5 = new MyThread3(5);
		MyThread3 t6 = new MyThread3(6);
		MyThread3 t7 = new MyThread3(7);
		MyThread3 t8 = new MyThread3(8);
		MyThread3 t9 = new MyThread3(9);
		MyThread3 t10 = new MyThread3(10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}
