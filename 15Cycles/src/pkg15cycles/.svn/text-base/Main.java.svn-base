package pkg15cycles;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    int res=0;
    do
    {
      res*=10;
      res+=n%10;
      n/=10;
    }
    while(n>0);
    System.out.println("Обратное число: "+res);
  }
}
