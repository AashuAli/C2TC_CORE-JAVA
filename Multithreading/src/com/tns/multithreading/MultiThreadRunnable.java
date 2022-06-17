package com.tns.multithreading;
class Eclipse1 implements Runnable {
	public void run() {
		for(int i=0;i<=5;i++)
		System.out.println("Eclipse thread ID id: " +Thread.currentThread().getId());
	}
}
class PPT1 implements Runnable {
public void run() {
	for(int i=0;i<=5;i++)
	System.out.println("PPT thread ID id: " +Thread.currentThread().getId());
	}
	
}
class NotePad1 implements Runnable {
	public void run() {
		for(int i=0;i<=5;i++)
		System.out.println("Notepad thread ID id: " +Thread.currentThread().getId());
	}
}

public class MultiThreadRunnable {

	public static void main(String[] args) {
		Eclipse1 obj1=new Eclipse1();
		Thread t=new Thread(obj1);
		t.start();
		PPT1 obj2=new PPT1();
		Thread t1=new Thread(obj2);
		t1.start();
		NotePad1 obj3=new NotePad1();
		Thread t2=new Thread(obj3);
		t2.start();

	}

}
