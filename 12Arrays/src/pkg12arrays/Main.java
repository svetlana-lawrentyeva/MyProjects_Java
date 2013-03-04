package pkg12arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for (int i = 0; i < arr.length; ++i)
    {
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<arr.length/2;++i)
    {      
      System.out.print(arr[i]+" "+arr[arr.length-1-i]+" ");
    }
    if(arr.length%2!=0)
    {
      System.out.print(arr[arr.length/2]);
    }
  }
}