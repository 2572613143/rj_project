package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class MyThread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for (int i = 1; i < 11; i++) {
			sum+=i;
		}
		return sum;
	}
	public class Thread_test6 {

	public void main(String[] args) throws Exception, ExecutionException {
	MyThread mt1=new MyThread();
	FutureTask<Object> ft1=new FutureTask<>(mt1);
	Thread t1=new Thread(ft1,"线程1");
	t1.start();
	System.out.println("线程1求和的结果是"+ft1.get());
	}
	
}
}