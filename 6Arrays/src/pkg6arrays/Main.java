package pkg6arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[]arr=new int[6];
    Scanner sc=new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    int sum=0;
    for(int i=0;i<arr.length;++i)
    {
      arr[i]=sc.nextInt();
      sum+=arr[i];
    }
    int average=sum/arr.length;
    System.out.println("Среднее: "+average);
    for(int i=0;i<arr.length;++i)
    {
      if(arr[i]<average)
      {
        System.out.print(arr[i]+" ");
      }
    }
  }
}