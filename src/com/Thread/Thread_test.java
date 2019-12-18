package com.Thread;

class Mythread1 extends Thread{

	public Mythread1(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class Thread_test {

	public static void main(String[] args) {
	Mythread1	thread1=new Mythread1("Thread1");
	thread1.start();
	Mythread1	thread2=new Mythread1("Thread2");
	thread2.start();
	}

}
