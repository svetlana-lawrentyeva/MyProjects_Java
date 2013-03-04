package pkg7func;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число в двотчной системе: ");
    String n=sc.next();
    System.out.println("Это "+findDecimal(n));
  }
  public static int findDecimal(String n)
  {
    int res=0;
    char[]arr=n.toCharArray();
    int two=1;
    for(int i=arr.length-1;i>=0;--i)
    {
      res+=(Integer.parseInt(""+arr[i]))*two;
      two*=2;
    }
    return res;
  }
}