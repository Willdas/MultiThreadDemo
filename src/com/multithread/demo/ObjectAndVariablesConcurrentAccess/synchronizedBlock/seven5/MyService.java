package com.multithread.demo.ObjectAndVariablesConcurrentAccess.synchronizedBlock.seven5;

public class MyService {

	public MyOneList addServiceMethod(MyOneList myOneList,String data) {
		try {
			// 不加synchronized 出现脏读现象
			/*if (myOneList.getSize() < 1) {
				Thread.sleep(2000); //模拟从远程花费2秒取回数据
				myOneList.add(data);
			}*/
			
			/*
			 * 加synchronized完成同步化 由于list参数对象在项目中是一份实例,是单例的,
			 * 而且也正要对list参数的getSize()方法做同步的调用,所以就对list参数进行同步处理
			 * 
			 */
			synchronized (myOneList) {  
				if (myOneList.getSize() < 1) {
					Thread.sleep(2000); //模拟从远程花费2秒取回数据
					myOneList.add(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myOneList;
	}
}
