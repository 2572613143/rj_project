package com.Thread;

class TicketWindow4 implements Runnable{
	
	private int tickets=10;
	//定义对象为同步锁
	
	
	public  void run(){
		while(true){
			Maipiao();
			}
	}
	private synchronized void Maipiao() {
		if (tickets>0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(tickets>0) {
			System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
		}
		
	}
}
public class Thread_13 {

	public static void main(String[] args) {

	TicketWindow4 tw=new TicketWindow4();
	new Thread(tw,"窗口1").start();
	new Thread(tw,"窗口2").start();
	new Thread(tw,"窗口3").start();
	new Thread(tw,"窗口4").start();
	}

}
