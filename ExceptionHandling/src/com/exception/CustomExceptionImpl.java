package com.exception;

public class CustomExceptionImpl {

	public void getMsg(int age) throws CustomException{
		if (age > 18) {
			System.out.println("good");
		} else {
			CustomException c=new CustomException();
			throw new CustomException();
		}
	}
	public static void main(String[] args) {
		new CustomExceptionImpl().getMsg(20);
	}

}
