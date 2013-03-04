package calc;

import java.util.Scanner;

public class Calc {
	static double a;
	static double b;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	sc.useLocale(new java.util.Locale("us"));
	do
	{
		if(sc.hasNextDouble())
		{
	a=sc.nextDouble();
	b=sc.nextDouble();
		}
	String s=sc.next();
	System.out.println(count(a,b,s));
	}while(true);
	}
	private static double count(double a,double b,String s)
	{
		double result=0;
		if(s.equals("+"))
		{
			result=a+b;
		}
		else if(s.equals("-"))
		{
			result=a-b;
		}
		else if(s.equals("/"))
		{
			result=a/b;
		}
		else if(s.equals("*"))
		{
			result=a*b;
		}
		else
		{
			result=0;
		}
		return result;
	}
}
