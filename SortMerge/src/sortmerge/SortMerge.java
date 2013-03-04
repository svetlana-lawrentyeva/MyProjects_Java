package sortmerge;

public class SortMerge
{
    public static void main(String[] args)
    {
        MyArray arr=new MyArray();
        int []initArray={20,8,1,19,17,2,0};
        arr.init(initArray);
        arr.sortMerge();
        arr.printArray();
    }
}
