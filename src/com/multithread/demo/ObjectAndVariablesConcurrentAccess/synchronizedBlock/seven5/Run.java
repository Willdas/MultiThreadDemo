package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven5;


/*
 * 验证多个线程调用同一个方法是随机的   
 * 	
 * 由于线程执行的顺序是不确定的,所以当线程A和线程B的执行带有分支判断的方法时,就会出现逻辑上的错误,有可能出现脏读.
 * 
 * 解决方式:同步化 修改MyService方法加上synchronized关键字并且对myOnlist进行同步
 */
public class Run {

	public static void main(String[] args) {
		try {
			MyOneList myOneList = new MyOneList();
			MyThread1 myThread1 = new MyThread1(myOneList);
			myThread1.setName("A");
			myThread1.start();
			MyThread2 myThread2 = new MyThread2(myOneList);
			myThread2.setName("B");
			myThread2.start();
			Thread.sleep(5000); //等待两个线程全部执行完毕
			System.out.println("myOneList=" + myOneList.getSize());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
