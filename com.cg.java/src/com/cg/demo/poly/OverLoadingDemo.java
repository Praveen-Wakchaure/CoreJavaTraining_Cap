package com.cg.demo.poly;

public class OverLoadingDemo {
	
	public static void main(String[] args) {

		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);
	}

	static void add(int i, int j) {
		System.out.println(i + j);
	}

	static void add(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	static void add(int i, int j, int k, int l) {
		System.out.println(i + j + k + l);
	}


}
