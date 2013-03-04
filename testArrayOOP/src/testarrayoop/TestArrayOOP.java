package testarrayoop;

public class TestArrayOOP
{
  public static void main(String[] args)
  {
    MyArray arr = new MyArray();
    int[]initArr={34, 23, 8, 78, 12, 45, 98, 56, 115, 42, 4, 8, 66, 0, 15, 16};
    arr.init(initArr);
    System.out.println(arr.max());
    arr.mergeSort();
    arr.printArray();
  }
}
