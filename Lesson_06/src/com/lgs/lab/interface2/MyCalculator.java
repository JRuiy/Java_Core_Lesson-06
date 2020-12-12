package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	private int a;
	private int b;
	
	public MyCalculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void plus() {
		int c = a + b;
		System.out.println("a+b= " + c);
	}

	@Override
	public void minus() {
		int c = a - b;
		System.out.println("a-b= " + c);
	}

	@Override
	public void multiply() {
		int c = a * b;
		System.out.println("a*b= " + c);
	}

	@Override
	public void devide() {
		int c = a / b;
		System.out.println("a/b= " + c);
	}

}
