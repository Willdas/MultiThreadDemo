package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.thirteen;

import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.thirteen.PublicClass.PrivateClass;

/*
 * 内置类与静态内置类
 */
public class Run {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());
		
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge() + " " +privateClass.getAddress());
	}

}
