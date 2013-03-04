package pkg2rec;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {    
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    System.out.println("Фибоначчи: "+getFibonacci(n));
  }
  public static int getFibonacci(int n)
  {
     return n > 1 ? getFibonacci(n-1) + getFibonacci(n - 2) : 1;
  }
}