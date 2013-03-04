package taskselementary;

public class Conditional
{
  public static int task_1a(int a, int b)
  {
    int result=0;
    if(a>b) result=a;
    else result=b;
    return result;
  }
  public static int task_1b(int a, int b, int c)
  {
    if(a<b)
    {
      int temp=a;
      a=b;
      b=temp;
    }
    if(a<c)
    {
      int temp=a;
      a=c;
      c=temp;
    }    
    return a;
  }
  public static int task_1c(int a, int b, int c, int d)
  {
    if(a<b)
    {
      int temp=a;
      a=b;
      b=temp;
    }
    if(c<d)
    {
      int temp=c;
      c=d;
      d=temp;
    }
    if(a<c)
    {
      int temp=a;
      a=c;
      c=temp;
    }
    return a;
  }
  public static int task_3a(int a,int b) throws IllegalArgumentException
  {
    int result=0;
    if(a%2==0)
    {
      if(Integer.MAX_VALUE/(double)b<a)throw new IllegalArgumentException("результат превышает max_int");
      result=a*b;
    }
    else
    {
      if(Integer.MAX_VALUE-b<a)throw new IllegalArgumentException("результат превышает max_int");
      result=a+b;
    }
    return result;
  }
}
