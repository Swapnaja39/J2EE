package com.jspiders.multithreading.thread;

public class MyThread4 implements Runnable{
	public void run() {
		System.out.println("Name of thread: "+Thread.currentThread().getName());
		System.out.println("Priority of Thread: "+Thread.currentThread().getPriority());
	}
}
