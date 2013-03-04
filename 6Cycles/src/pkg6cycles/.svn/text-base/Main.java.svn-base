package pkg6cycles;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число: ");
        int n=sc.nextInt();
        String str=""+n;
        char[]arr=str.toCharArray();
        int counter=0;
        for(int i=0; i<arr.length/2; ++i)
        {
            if(arr[i]==arr[arr.length-i-1])
            {
                ++counter;
            }
        }
        if(counter==arr.length/2)
        {
            System.out.println("Данное число является полиндромом");
        }
        else
        {
            System.out.println("Данное число не является полиндромом");
        }
    }
}
