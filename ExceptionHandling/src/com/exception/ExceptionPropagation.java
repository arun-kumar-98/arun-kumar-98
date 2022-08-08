package com.exception;

public class ExceptionPropagation {

	public void method1() {
		int[] arr = { 10, 30, 20, 40 };
		System.out.println(arr[6]);
	}

	public void method2() {
		method1();
	}

	public void method3() {
		try {
			method2();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception cought");

		}

	}

	public static void main(String[] args) {

		ExceptionPropagation exceptionPropagation = new ExceptionPropagation();
		exceptionPropagation.method3();

	}
}
