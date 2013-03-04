package pkg16cycles;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    System.out.print("Введите цифру, которую хотите вставить в число: ");
    int c=sc.nextInt();
    int n1=n;
    int length=0;
    while(n1>0)
    {
      length++;
      n1/=10;
    }
    System.out.print("В числе "+length+" цифр. На какую позицию Вы хотите вставить свою цифру? ");
    int p=sc.nextInt();
    length++;
    int res=0;
    int st=1;
    for(int i=0;i<length-p;++i)
    {
      st*=10;
    }
    res+=n%st;
    res+=c*st;
    n/=st;
    n*=st*10;
    res+=n;
    System.out.println(res);
  }
}
