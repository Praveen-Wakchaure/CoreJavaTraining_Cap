package com.cg.demo.MyThread;

public class AppRunnableDemo implements Runnable {
	@Override
	public void run() {
		this.printLoop();
	}
	void printLoop() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(250); // 2.5 + 2.5 = 5
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Start");

		App obj = new App();
		AppRunnableDemo obj = new AppRunnableDemo();
		Thread threadObj = new Thread(obj);

		App obj2 = new App();
		AppRunnableDemo obj2 = new AppRunnableDemo();
		Thread threadObj2 = new Thread(obj2);

		threadObj.start();
		threadObj2.start();
	}
}