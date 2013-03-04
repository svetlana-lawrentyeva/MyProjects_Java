package pkg10cycles;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    int rez1=0;
    int i=1;
    while(rez1==0)
    {
      if(i*i==n)
      {
        rez1=i;
      }
      else if(i*i>n)
      {
        if((i*i-n)>(n-(i-1)*(i-1)))
        {
          rez1=i-1;
        }
        else
        {
          rez1=i;
        }
      }
      ++i;
    }
    System.out.println("Квадратный корень перебором: "+rez1);
    int rez2=0;
    int first=1;
    int last=n;
    while(rez2==0)
    {
      i=first+(last-first)/2;
      if(last-first==1)
      {
        if((last*last-n)>(n-first*first))
        {
          rez2=first;
        }
        else
        {
          rez2=last;
        }
      }
      if(i*i==n)
      {
        rez2=i;
      }
      else if(i*i>n)
      {
        last=i;
      }
      else
      {
        first=i;
      }
    }
    
    System.out.println("Квадратный корень двоичным поиском: "+rez2);
  }
}
