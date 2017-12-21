package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.one;

public class PrintString {
	private boolean isContinuePrint = true;
	
	private boolean isContinuePrint(){
		return isContinuePrint;
	}
	
	public void setContinuePrint(boolean isContinuePrint){
		this.isContinuePrint = isContinuePrint;
	}
	
	public void printStringMethod(){
		try {
			while (isContinuePrint == true) {
				System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
