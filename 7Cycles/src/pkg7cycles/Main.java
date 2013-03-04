package pkg7cycles;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        for (int i = 2; i < n; ++i)
        {
            int counter = 0;
            for (int j = 1; j <= i / 2; ++j)
            {
                if (i % j == 0)
                {
                    ++counter;
                }
            }
            if (counter<=1)
            {
                System.out.println(i);
            }
        }
    }
}
