package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.five;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
	
	private AtomicInteger atomicInteger = new AtomicInteger(0);
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(atomicInteger.incrementAndGet());
		}
	}
}
