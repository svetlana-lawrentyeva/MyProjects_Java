package iteratortest;
public class IteratorTest
{
    public static void main(String[] args)
    {
        int[]initArr={12,45,99,66,3};
        MyArrayList arr=new MyArrayList();
        arr.init(initArr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
