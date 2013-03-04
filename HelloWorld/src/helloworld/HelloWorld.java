package helloworld;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		int a=99;
		int b=98;
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("чему равно а: ");
		a=sc.nextInt();
		System.out.print("чему равно b: ");
		b=sc.nextInt();
		System.out.print("ответ: ");
		c=a+b;
		System.out.println(a+"+"+b+"="+c);
		}while(c!=10);
		System.out.println("до свидания!!!");
	}

}
