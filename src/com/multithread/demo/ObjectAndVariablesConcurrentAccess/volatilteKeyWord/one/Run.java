package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.one;

/*
 * volatile关键字
 * 
 * 关键字的主要作用是使变量在多个线程间可见
 */

  /*
   * 关键字volatile与死循环
   * 
   * 当main线程一直处于while()循环中时,导致程序不能继续执行后面的代码,解决的办法是用多线程技术.
   */

public class Run {
	
	public static void main(String[] args) {
		PrintString printString = new PrintString();
		printString.printStringMethod();
		System.out.println("我要停止它,stopThread=" + Thread.currentThread().getName());
		printString.setContinuePrint(false);
	}
}
