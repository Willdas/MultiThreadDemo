package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.two;

/*
 * 解决同步死循环
 */

  /*
   * 关键字volatile的作用是强制从公共堆栈中取得变量的值,而不是从线程私有数据栈中取得变量的值
   * 以下代码在server服务器模式中的64bit的jvm上,会出现死循环.解决方法:使用volatile关键字
   * 
   */

public class Run {
	
	public static void main(String[] args) {
		PrintString printString = new PrintString();
		new Thread().start();
		System.out.println("我要停止它,stopThread=" + Thread.currentThread().getName());
		printString.setContinuePrint(false);
	}
}
