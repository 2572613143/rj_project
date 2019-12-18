package com.Thread;
class MyThread2 implements Runnable{

	public void run() {
		// TODO 自动生成的方法存根
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
	
}
public class Threadr_test {

	public static void main(String[] args) {
	MyThread2	mt1=new MyThread2();
	Thread t1=new Thread(mt1,"线程1");
	t1.start();
	MyThread2	t2=new MyThread2();
	new Thread(t2,"线程2").start();
	new Thread(new MyThread2(),"线程3").start();
	}

}
