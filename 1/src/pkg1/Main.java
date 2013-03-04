package pkg1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int max=0;
        if(a>b)max=a;
        if(c>max)max=c;
        if(d>max)max=d;
        System.out.println("max: "+max);
//        System.out.print("Введите количество чисел: ");
//        int quantity=sc.nextInt();
//        int []arr=new int[quantity];
//        for(int i=0; i< quantity;++i)
//        {
//            System.out.print("Введите "+(i+1)+" число: ");
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Наибольшее число: "+compare(arr));
    }
    private static int compare(int[]arr)
    {
        int result=arr[0];
        for(int i=1; i<arr.length;++i)
        {
            if(arr[i]>result)
            {
                result=arr[i];
            }
        }
        return result;
    }
}
