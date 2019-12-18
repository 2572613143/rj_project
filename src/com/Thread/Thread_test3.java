
package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread3 implements Callable<Object>{
	public Integer call() throws Exception{
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
		return i;
	}

	
}
public class Thread_test3 {

	public static void main(String[] args) throws Exception, ExecutionException {
	MyThread3	mt1=new MyThread3();
	FutureTask<Object> ft1=new FutureTask<>(mt1);
	Thread t1=new Thread(ft1,"线程1");
	t1.start();
	MyThread3	mt2=new MyThread3();
	new Thread(new FutureTask<>(mt2),"线程2").start();
	new Thread(new FutureTask(new MyThread3()),"线程3").start();
	System.out.println("线程1返回的结果是"+ft1.get());
	}
	

}
