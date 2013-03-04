package pkg9cycles;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    for(int i=1;i<=n/2;++i)
    {
      if(n%i==0)
      {
        System.out.println(i);
      }
    }
    System.out.println(n);
  }
}
