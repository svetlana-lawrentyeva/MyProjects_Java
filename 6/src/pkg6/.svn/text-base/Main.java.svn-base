package pkg6;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите 2 стороны первого конверта: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Введите 2 стороны второго конверта: ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int firstMin=Math.min(a, b);
        int firstMax=Math.max(a, b);
        int secondMin=Math.min(c, d);
        int secondMax=Math.max(c, d);
        if(firstMin<secondMin&firstMax<secondMax)
        {
            System.out.println("Первый конверт можно вложить во второй");
        }
        else if(secondMin<firstMin&secondMax<firstMax)
        {
            System.out.println("Второй конверт можно вложить в первый");
        }
        else
        {
            System.out.println("Конверты нельзя вложить друг в друга");
        }
    }
}
