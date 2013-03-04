package myarraylist;

public class Main
{
    public static void main(String[]args)
    {
        MyArrayList myArray=new MyArrayList();
        myArray.addEnd(16);
        System.out.println(myArray);
        myArray.addEnd(4);
        System.out.println(myArray);
        myArray.addStart(55);
        System.out.println(myArray);
        myArray.addPos(1, 14);
        System.out.println(myArray);
        myArray.sort();
        System.out.println(myArray);
    }
}
