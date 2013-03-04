package pkg5;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите a: ");
        int a=sc.nextInt();
        System.out.print("Введите b: ");
        int b=sc.nextInt();
        System.out.print("Введите c: ");
        int c=sc.nextInt();
        int result=0;
        if((a*b*c)>(a+b+c))result=a*b*c;
        else result=a+b+c;
        System.out.println("Результат: "+(result+3));
    }
}
