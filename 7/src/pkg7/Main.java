package pkg7;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Введите количество чисел: ");
            int quantity = sc.nextInt();
            System.out.print("Введите первое число: ");
            a = sc.nextInt();
            System.out.print("Введите второе число: ");
            b = sc.nextInt();
            if (quantity == 2)
            {
                int[] arr = Sort.sort(a, b);
                System.out.println(arr[0] + " " + arr[1]);
            } else if (quantity > 2)
            {
                System.out.print("Введите третье число: ");
                c = sc.nextInt();
                if (quantity == 3)
                {
                    int[] arr = Sort.sort(a, b, c);
                    System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
                } else if (quantity == 4)
                {
                    System.out.print("Введите четвертое число: ");
                    d = sc.nextInt();
                    int[] arr = Sort.sort(a, b, c, d);
                    System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
                }
            }
        }
    }
}
