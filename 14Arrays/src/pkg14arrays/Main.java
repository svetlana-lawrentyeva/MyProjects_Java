package pkg14arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = new int[100];
    Scanner sc = new Scanner(System.in);
    /*
     * Ai = (Ai-1*d)%m
     */
    System.out.println("Введите первый эл-т массива");
    arr[0]=sc.nextInt();
    System.out.println("Введите d");
    int d=sc.nextInt();
    System.out.println("Введите m");
    int m=sc.nextInt();
    for (int i = 1; i < arr.length; ++i)
    {
      arr[i] = (arr[i-1]*d)%m;
    }
    for(int i=0;i<arr.length;++i)
    {      
      System.out.print(arr[i]+" ");
    }
  }
}
