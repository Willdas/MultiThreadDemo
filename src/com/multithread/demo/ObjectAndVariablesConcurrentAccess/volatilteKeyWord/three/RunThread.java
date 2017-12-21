package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.three;

public class RunThread extends Thread{
	private boolean isRunning = true;
	
	public boolean isRunning(){
		return isRunning;
	}
	
	public void setRunning(boolean isRunning){
		this.isRunning = isRunning;
	}
	
	@Override
	public void run() {
		System.out.println("进入 run 方法");
		while (isRunning == true) {
			
		}
		System.out.println("线程被停止了");
	}
}
