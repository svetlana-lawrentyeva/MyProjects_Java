package pkg3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите x: ");
        int x=sc.nextInt();
        System.out.print("Введите y: ");
        int y=sc.nextInt();
        String result="";
        if(x>0&y>0)result="в 1 четверти";
        else if(x<0&y>0)result="в 2 четверти";
        else if(x<0&y<0)result="в 3 четверти";
        else if(x>0&y<0)result="в 4 четверти";
        if(x==0)result="на оси X";
        if(y==0)result="на оси Y";
        if(x==0&y==0)result="в центре коодинат";
        System.out.println("Точка находится "+result+"");
    }    
}
