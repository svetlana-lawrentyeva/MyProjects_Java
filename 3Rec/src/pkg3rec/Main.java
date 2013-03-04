package pkg3rec;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {    
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    System.out.print("Введите степень: ");
    int st=sc.nextInt();
    System.out.println("Результат: "+pow(n,st));
  }
  public static long pow(int n, int st)
  {
    long res;
    if(st==0)
    {
      res=1;
    }
    else if(st%2==0)
    {
      long p=pow(n,st/2);
      res=p*p;
    }
    else
    {
      long p=pow(n,st/2);
      res=p*p*n;
    }
    return res;
  }
}
