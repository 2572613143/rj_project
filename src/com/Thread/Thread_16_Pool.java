package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Mythread_pool implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()
					+"的call()方法在运行");
		}
		return i;
	}
	
}
public class Thread_16_Pool {

	public static void main(String[] args) throws Exception, ExecutionException {
		Mythread_pool mythread_pool =new Mythread_pool();
		ExecutorService executor=Executors.newCachedThreadPool();
		Future<Object> result1=executor.submit(mythread_pool);
		Future<Object> result2=executor.submit(mythread_pool);
		executor.shutdown();
		System.out.println("thread-1返回的结果:"+result1.get());
		System.out.println("thread-2返回的结果:"+result2.get());
	}

}
