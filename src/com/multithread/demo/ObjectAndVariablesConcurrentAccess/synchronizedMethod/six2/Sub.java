package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.six2;

public class Sub extends Man {
	
	synchronized public void operateISubMethod(){
		try {
			while (i > 0) {
				i--;
				System.out.println("sub print i=" + i);
				Thread.sleep(100);
				this.operateIMainMethod();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
