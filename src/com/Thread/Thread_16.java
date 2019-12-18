package com.Thread;

import java.util.ArrayList;
import java.util.List;


public class Thread_16 {
	public static void main(String[] args) {
		List<Object>goods=new ArrayList<>();
		
		long start=System.currentTimeMillis();
		//生产者线程
			Thread	t1=new Thread(()->{
			int i=0;
			while (System.currentTimeMillis()-start<30) {
				synchronized (goods) {
					if (goods.size()>0) {
						try {
							goods.wait();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					else {
						goods.add("商品"+(++i));
						System.out.println("生产商品"+i);
					}
				}
				
			}
		},"生产者线程"); 
		//消费者线程
			Thread	t2=new Thread(()->{
					int i=0;
					while (System.currentTimeMillis()-start<30) {
						synchronized (goods) {
							if (goods.size()<=0) {
								goods.notify();
							} 
							else {
								goods.remove("商品"+(++i));
								System.out.println("消费商品"+i);
							}
						}
						
					}
				},"消费者线程");
			t1.start();
			t2.start();
	}
	
}
