package pkg5arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[]arr=new int[5];
    int[]temp=new int[arr.length];
    Scanner sc=new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for(int i=0;i<arr.length;++i)
    {
      arr[i]=sc.nextInt();
      temp[temp.length-i-1]=arr[i];
    }
    arr=temp;
    for(int i=0;i<arr.length;++i)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
