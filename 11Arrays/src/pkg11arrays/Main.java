package pkg11arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = new int[10];
    int[]temp=new int[arr.length];
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for (int i = 0; i < arr.length; ++i)
    {
      arr[i] = sc.nextInt();
      temp[i]=arr[i];
    }
    int middl;
    if(arr.length%2==0)
    {
      middl=arr.length/2;
    }
    else
    {
      middl=arr.length/2+1;
    }
    for(int i=0;i<arr.length/2;++i)
    {
      temp[i]=arr[middl+i];
      temp[middl+i]=arr[i];
    }
    arr=temp;
    for(int i=0;i<arr.length;++i)
    {
      System.out.print(arr[i]+" ");
    }
  }
}