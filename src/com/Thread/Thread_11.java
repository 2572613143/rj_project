package com.Thread;
class EmergencyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入"+i);
		}
		
	}
	
}
public class Thread_11 {

	public static void main(String[] args) throws Exception {	
			Thread t1=new Thread(new EmergencyThread(),"线程1");
			t1.start();
			for (int i = 1; i < 6; i++) {
				System.out.println(Thread.currentThread().getName()+"输入"+i);
				if (i==3) {
					t1.join();
				}
			}
	}

}
