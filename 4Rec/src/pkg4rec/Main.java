package pkg4rec;

public class Main
{
  public static void main(String[] args)
  {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; ++i)
    {
      arr[i] = i + 1;
    }
    rec(arr);
  }

  public static void rec(int[] arr)
  {
    for (int i = 0; i < arr.length; ++i)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    if (arr.length > 1)
    {
      int middle = arr.length / 2 + arr.length % 2;
      int[] arrLeft = new int[middle];
      int[] arrRight = new int[arr.length - middle];
      System.arraycopy(arr, 0, arrLeft, 0, arrLeft.length);
      System.arraycopy(arr, middle, arrRight, 0, arrRight.length);
      rec(arrLeft);
      rec(arrRight);
    }
  }
}
