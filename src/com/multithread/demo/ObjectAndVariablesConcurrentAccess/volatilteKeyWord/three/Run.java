package com.multithread.demo.ObjectAndVariablesConcurrentAccess.volatilteKeyWord.three;

/*
 * 解决异步死循环
 * 
 * 以下代码造成代码:System.out.println("线程被停止了"); 从未被执行.
 * 
 * 在启动RunThread.java文件时,变量private boolean isRunning = true;存在于公共堆栈及线程的私有堆栈中.
 * 在JVM被设置为-server模式时为了线程运行的效率.线程一直在私有堆栈中取得isRunning的值true,而代码thread.setRunning(false);
 * 虽然被执行,更新的却是公共堆栈中的isRunning变量值false,所以一直就是死循环的状态
 * 
 * 出现这个问题就是私有的值和公共堆栈中的值不同步造成的
 * 解决方式: 使用valatile关键字
 * 
 */
public class Run {

	public static void main(String[] args) {
		try {
			RunThread runThread = new RunThread();
			runThread.start();
			Thread.sleep(1000);
			runThread.setRunning(false);
			System.out.println("已经赋值为false");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
