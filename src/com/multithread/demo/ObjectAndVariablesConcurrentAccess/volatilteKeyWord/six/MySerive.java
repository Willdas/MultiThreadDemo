package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.six;


import java.util.concurrent.atomic.AtomicLong;

public class MySerive {
	public static AtomicLong atomicLong = new AtomicLong();
	public void addNum(){
		System.out.println(Thread.currentThread().getName() + " 加了100之后的值是:" + atomicLong.addAndGet(100));
		atomicLong.addAndGet(1);
	}
}
