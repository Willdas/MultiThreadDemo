package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.eight;

public class Sub extends Main{
	
	//异步执行
	@Override
	public void serviceMethod() {
		try {
			System.out.println("int sub 下一步 sleep begin threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep end threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
			super.serviceMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//同步执行
	/*@Override
	synchronized public void serviceMethod() {
		try {
			System.out.println("int sub 下一步 sleep begin threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub 下一步 sleep end threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
			super.serviceMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
}
