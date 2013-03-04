package pkg6func;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число: ");
    int n=sc.nextInt();
    System.out.println("Двоичная запись: "+findBinary(n));
    System.out.println("Шестнадцатеричная запись: "+findHexadecimal(n));
  }
  public static String findBinary(int n)
  {
    String res="";
    do
    {
      res=n%2+res;
      n/=2;
    }
    while(n>0);
    return res;
  }
  public static String findHexadecimal(int n)
  {
    String []arr={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    String res="";
    do
    {
      res=arr[n%16]+res;
      n/=16;
    }
    while(n>0);
    return res;
  }
}