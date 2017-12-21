package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight3;

import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight2.MyObject;
import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight2.Service;
import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight2.ThreadA;
import com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.eight2.ThreadB;

/*
 * 细化验证3个结论
 */

/*
 * 3)当其他线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果
 */
public class Run {

	public static void main(String[] args) {
		
		try {
			Service service = new Service();
			MyObject myObject = new MyObject();
			ThreadA threadA = new ThreadA(service,myObject);
			threadA.setName("A");
			threadA.start();
			Thread.sleep(100);
			ThreadB threadB = new ThreadB(myObject);
			threadB.setName("B");
			threadB.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
