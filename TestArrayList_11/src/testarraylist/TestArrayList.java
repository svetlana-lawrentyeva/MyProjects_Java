package testarraylist;

public class TestArrayList
{
  public static void main(String[] args)
  {
    MyAList arr=new MyAList();
    arr.addStart(23);
    for(int i=0;i<15;++i)
    {
      arr.addEnd(i);
    }
    arr.addPosition(5, 100);
    System.out.println(arr.toString());
  }
}
