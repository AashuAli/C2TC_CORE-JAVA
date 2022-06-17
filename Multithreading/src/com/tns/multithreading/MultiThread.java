package com.tns.multithreading;
class Eclipse extends Thread {
	public void run() {
		//for(int i=0;i<=5;i++){
		System.out.println("Eclipse thread ID id: " +Thread.currentThread().getId());
		System.out.println("Eclipse thread priority id: " +Thread.currentThread().getPriority());
	}
  }
//}
class PPT extends Thread {
public void run() {
	//for(int i=0;i<=5;i++) {
	System.out.println("PPT thread ID id: " +Thread.currentThread().getId());
	System.out.println("PPT thread priority id: " +Thread.currentThread().getPriority());
	}
	
     }
//}
class NotePad extends Thread {
	public void run() {
		//for(int i=0;i<=5;i++){
		System.out.println("Notepad thread ID id: " +Thread.currentThread().getId());
		System.out.println("Notepad thread priority id: " +Thread.currentThread().getPriority());
	}
 }
//}



public class MultiThread {

	public static void main(String[] args) {
		Eclipse obj1=new Eclipse();
		obj1.start();
		obj1.setPriority(6);
		PPT obj2=new PPT();
		obj2.start();
		obj2.setPriority(8);
		NotePad obj3=new NotePad();
		obj3.start();
		obj3.setPriority(9);
		System.out.println("Main thread ID id: " +Thread.currentThread().getId());
		

	}

}
