package pkg8arrays;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = new int[6];
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите эл-ты массива");
    for (int i = 0; i < arr.length; ++i)
    {
      arr[i] = sc.nextInt();
    }
    int counter = 0;
    for (int i = 0; i < arr.length / 2; ++i)
    {
      if (arr[i] == arr[arr.length - i - 1])
      {
        ++counter;
      }
    }
    if (counter == arr.length / 2)
    {
      System.out.println("Данный массив является полиндромом");
    }
    else
    {
      System.out.println("Данный массив не является полиндромом");
    }
  }
}