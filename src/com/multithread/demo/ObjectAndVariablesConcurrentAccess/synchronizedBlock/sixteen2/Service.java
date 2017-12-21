package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.sixteen2;

public class Service {

	public void serviceMethodA(UserInfo userInfo) {
		synchronized (userInfo) {
			try {
				System.out.println(Thread.currentThread().getName());
				userInfo.setUsername("abc");
				Thread.sleep(3000);
				System.out.println("end time="+System.currentTimeMillis());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
