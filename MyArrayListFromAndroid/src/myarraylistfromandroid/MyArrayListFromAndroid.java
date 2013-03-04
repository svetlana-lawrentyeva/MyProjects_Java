package myarraylistfromandroid;

import com.sun.org.apache.bcel.internal.generic.ILOAD;

public class MyArrayListFromAndroid
{
    public static void main(String[] args)
    {
        IList arr=new AList();
        int[]a={78,79,3365,549,12,19};
        arr.init(a);
        System.out.println(arr);
        arr.addStart(1000);
        System.out.println(arr);
        arr.addPos(3, -1);
        System.out.println(arr);
        arr.delPos(3);
        System.out.println(arr);
        arr.sort();
        System.out.println(arr);
    }
}
