package pkg3func;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Введите число дня недели: ");
    int n=sc.nextInt();
    System.out.println(getWeekday(n));
  }
  public static String getWeekday(int n)
  {
    String res="";
    switch(n)
    {
      case 1:
        res="Понедельник";
        break;
      case 2:
        res="Вторник";
        break;
      case 3:
        res="Среда";
        break;
      case 4:
        res="Четверг";
        break;
      case 5:
        res="Пятница";
        break;
      case 6:
        res="Суббота";
        break;
      case 7:
        res="Воскресенье";
        break;
        default:
          res="Ошибка";
    }
    return res;
  }
}