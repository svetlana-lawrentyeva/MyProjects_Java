package evennumbers;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a*b);
		}
		else
		{
			System.out.println(a+b);
		}
		}while(true);
	}

}
