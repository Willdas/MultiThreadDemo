package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedMethod.five;

public class PublicVar {
	public String username = "A";
	public String password = "AA";
	
	//同步方法setValue()的锁属于类publicVar的实例
 	synchronized public void setValue(String username,String password){
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name=" + Thread.currentThread().getName() + " username=" + username + " password=" + password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 	//加关键字是为了使setValue()和getValue()方法保持同步,不会出现脏读现象
 	synchronized public void getValue(){
 		System.out.println("getValue method thread name=" + Thread.currentThread().getName() + " username=" + username +" password=" + password);
 	}
}




