package com.example.asyntask;

public class NetOperator {
	public void operate() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
