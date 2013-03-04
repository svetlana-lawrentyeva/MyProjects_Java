package com.svetlanalawrentyeva.calculator;

public class Calculator {
	public static int count(int a, int b, char c) throws ArithmeticException, IllegalArgumentException {
		int result=0;
		switch(c) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			if(b==0)throw new ArithmeticException("Devide by zero");
			result=a/b;
			break;
		default:
			throw new IllegalArgumentException("Wrong operator");	
		}
		return result;
	}
}
