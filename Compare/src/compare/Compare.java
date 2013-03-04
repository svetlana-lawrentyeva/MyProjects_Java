package compare;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	do
	{
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b)
	{
		System.out.println(a+">"+b);
	}
	else if(a<b)
	{
		System.out.println(a+"<"+b);
	}
	else
	{
		System.out.println(a+"="+b);
	}
	}while(true);
	
	}

}
