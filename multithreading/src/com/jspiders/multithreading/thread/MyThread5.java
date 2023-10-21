package com.jspiders.multithreading.thread;

public class MyThread5 extends Thread{
	@SuppressWarnings("removal")
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			if(i==3) {
				stop();
			}
			System.out.println(getName()+" is now running");
		}
	}
}
