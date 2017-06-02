package com.multithread.demo.one.userThread.instanceVariable.synchronizedDemo;

public class LoginServlet {
	
	private static String usernameRef;
	private static String passwordRef;
	
	// 不加 synchronized 关键字测试 
	/*public static void doPost(String userName, String password) {
		try {
			usernameRef = userName;
			if (usernameRef.equals("a")) {
				Thread.sleep(1000);
			}
			passwordRef = password;
			System.out.println("username="+usernameRef+"--------"+"password="+passwordRef);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	// 解开注释测试
	// 加入 synchronized 关键字 解决线程安全问题
	synchronized public static void doPost(String userName, String password) {
		try {
			usernameRef = userName;
			if (usernameRef.equals("a")) {
				Thread.sleep(1000);
			}
			passwordRef = password;
			System.out.println("username="+usernameRef+"--------"+"password="+passwordRef);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
