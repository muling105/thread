package com.www;

public class MyThread extends Thread {

	public MyThread(){
		System.out.println("���췽����" + Thread.currentThread().getName());
	}
	
	@Override
	synchronized public void run() {
		System.out.println("run������" + Thread.currentThread().getName());
	}

}
