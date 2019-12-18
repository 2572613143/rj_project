package com.Thread;
class DeadLockThread implements Runnable{
 	static Object chopsticks=new Object();
 	static Object KnifeAndFork=new Object();
 	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if (flag) {
			while(true) {
				//chopsticks锁对象上的同步代码块
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
				
				synchronized (KnifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---if---KnifeAndFork");
				}
				}
			}
		}
		else {
			while(true) {
			synchronized (KnifeAndFork) {
				System.out.println(Thread.currentThread().getName()+"---else---KnifeAndFork");
			
			synchronized (chopsticks) {
				System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
			}
		}
		}
			}
	}
	
}
public class Thread_15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		
		
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"American").start();
		
	}

}
