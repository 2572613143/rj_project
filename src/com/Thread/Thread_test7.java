package com.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class MyThread_1 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for (int i = 1; i < 11; i++) {
			sum+=i;
		}
		

			switch (Thread.currentThread().getName()) {
			case "线程1":
				break;
			case "线程2":
				sum+=100;
				break;
			case "线程3":
				sum+=200;
				break;
			case "线程4":
				sum+=300;
				break;
			case "线程5":
				sum+=400;
				break;
			case "线程6":
				sum+=500;
				break;
			case "线程7":
				sum+=600;
				break;
			case "线程8":
				sum+=700;
				break;
			case "线程9":
				sum+=800;
				break;
			case "线程10":
				sum+=900;
				break;
			default:
				break;
			}
			return sum;
		}
}	
public class Thread_test7 {

	public static void main(String[] args) throws Exception, ExecutionException {
	MyThread_1 mt1=new MyThread_1();
	FutureTask<Object> ft1=new FutureTask<>(mt1);
	Thread t1=new Thread(ft1,"线程1");
	t1.start();
	/*System.out.println("线程1求和的结果是"+ft1.get());*/
	MyThread_1 mt2=new MyThread_1();
	FutureTask<Object> ft2=new FutureTask<>(mt2);
	Thread t2=new Thread(ft2,"线程2");
	t2.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/
	
	MyThread_1 mt3=new MyThread_1();
	FutureTask<Object> ft3=new FutureTask<>(mt3);
	Thread t3=new Thread(ft3,"线程3");
	t3.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/
	
	MyThread_1 mt4=new MyThread_1();
	FutureTask<Object> ft4=new FutureTask<>(mt4);
	Thread t4=new Thread(ft4,"线程4");
	t4.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/

	MyThread_1 mt5=new MyThread_1();
	FutureTask<Object> ft5=new FutureTask<>(mt5);
	Thread t5=new Thread(ft5,"线程5");
	t5.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/

	MyThread_1 mt6=new MyThread_1();
	FutureTask<Object> ft6=new FutureTask<>(mt6);
	Thread t6=new Thread(ft6,"线程6");
	t6.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/

	MyThread_1 mt7=new MyThread_1();
	FutureTask<Object> ft7=new FutureTask<>(mt7);
	Thread t7=new Thread(ft7,"线程7");
	t7.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/

	MyThread_1 mt8=new MyThread_1();
	FutureTask<Object> ft8=new FutureTask<>(mt8);
	Thread t8=new Thread(ft8,"线程8");
	t8.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/

	MyThread_1 mt9=new MyThread_1();
	FutureTask<Object> ft9=new FutureTask<>(mt9);
	Thread t9=new Thread(ft9,"线程9");
	t9.start();

	MyThread_1 mt10=new MyThread_1();
	FutureTask<Object> ft10=new FutureTask<>(mt10);
	Thread t10=new Thread(ft10,"线程10");
	t10.start();
	/*System.out.println("线程1求和的结果是"+ft2.get());*/
	int total=(int)ft1.get()+(int)ft2.get()+(int)ft3.get()+(int)ft4.get()+(int)ft5.get()+(int)ft6.get()+(int)ft7.get()+(int)ft8.get()+(int)ft9.get()+(int)ft10.get();
	System.out.println("线程1和线程2的求和结果是"+total);
	}
	
}

