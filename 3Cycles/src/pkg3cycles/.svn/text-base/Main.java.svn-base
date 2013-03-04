package pkg3cycles;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите любое число: ");
            int n = sc.nextInt();
            int d=0;
            for(int i=2;i<=n/2;++i)
            {
                if(n%i==0)
                {
                    ++d;
                }
            }
            if(d==0)
            {
                System.out.println("Данное число простое");
            }
            else
            {
                System.out.println("Данное число не простое, имеет "+d+" делителей");
            }
        }
    }
}
