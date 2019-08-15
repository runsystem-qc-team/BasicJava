package com.gmo.thuynt3;

public class MyFirstClass {

	public static void main(String[] args) {
		//Cast value
		int i = 50;
		short j = (short) i;
		double d = i;
		System.out.println("Short value is: " + j);
		System.out.println("Double value is: " + d);

		myStaticMethod();
		MyFirstClass oj = new MyFirstClass();
		oj.myPublicMethod();

	}

	static void myStaticMethod() {
		System.out.println("Static method can be called without creating object");
	}

	public void myPublicMethod() {
		System.out.println("Public method must  be called by creating object");
    
	}

}
