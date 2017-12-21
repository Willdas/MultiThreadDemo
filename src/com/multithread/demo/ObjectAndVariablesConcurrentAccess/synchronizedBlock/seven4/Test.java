package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven4;


/*
 * 验证多个线程调用同一个方法是随机的   
 * 	
 * 由于线程执行的顺序是不确定的,所以当线程A和线程B的执行带有分支判断的方法时,就会出现逻辑上的错误,有可能出现脏读.
 * 
 */
public class Test {

	public static void main(String[] args) {
		
		MyList myList = new MyList();
		MyThreadA myThreadA = new MyThreadA(myList);
		myThreadA.setName("A");
		myThreadA.start();
		MyThreadB myThreadB = new MyThreadB(myList);
		myThreadB.setName("B");
		myThreadB.start();
	}

}
