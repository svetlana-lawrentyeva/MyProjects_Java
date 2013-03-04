
package pkg8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {        
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите балл: ");
        int ball=sc.nextInt();
        char result='0';
        if(ball<=19)result='F';
        else if(ball>19&ball<=39)result='E';
        else if(ball>39&ball<=59)result='D';
        else if(ball>59&ball<=74)result='C';
        else if(ball>74&ball<=89)result='B';
        else if(ball>89&ball<=100)result='A';
        System.out.println("Оценка: "+result);
    }
}
