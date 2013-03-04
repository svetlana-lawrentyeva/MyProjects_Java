package pkg4func;

import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Введите число: ");
//    int n = sc.nextInt();
    for(int i=0;i<1001;++i)
    {
    System.out.println(numbersToWords(i));
    }
  }

  public static String numbersToWords(int n)
  {
    String res = "";
    String zero = "ноль";
    String[][] words = new String[4][];
    String[] units =
    {
      "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"
    };
    String[] firstTen =
    {
      "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    };
    String[] tens =
    {
      "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
    };
    String[] hundreds =
    {
      "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"
    };
    String thousand = "тысяча";
    words[0] = units;
    words[1] = firstTen;
    words[2] = tens;
    words[3] = hundreds;
    int count = 0;
    int temp=0;
    do
    {
      if (n == 0)
      {
        res = zero;
      }
      else if (n == 1000)
      {
        res = thousand;
        n = 0;
      }
      else
      {
        int next = n % 10;
        if(count==0)//если делаем единицы
        {
          temp=next;//на всякий случай, если потом будет первый десяток
        }
        if (next != 0) //если текущее число не ноль
        {
          if (count == 1) //если делаем десятки
          {
            if (next == 1&temp!=0) // если попался первый десяток, и это не десять
            {
              res = " " + words[count][temp - 1]; // затираем предыдущее и присваеваем нужное из перврго десятка
              count++; //перепрыгиваем через обычные десятки
            }
            else // если десяток не первый
            {
              count++; //пропускаем первый десяток
              res = " " + words[count][next - 1] + res; //берём нужный десяток
            }
          }
          else //если делаем НЕ десятки
          {
            res = " " + words[count][next - 1] + res; // берём нужное значение
          }
        }
        else if(count==1) // если 0 был в разряде десяток
        {
          count++; //пропускаем первый десяток
        }
        count++; // переход на 1 уровень вверх
        n /= 10;
      }
    }
    while (n > 0);
    return res;
  }
}