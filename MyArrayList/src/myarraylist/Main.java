package myarraylist;

public class Main
{
    public static void main(String[]args)
    {
        int[]tmp={135,5,669,57,33,-11,689,5587,-8896,0,12,8,1058};
        IList myArray=new MyLList();
//        myArray.addEnd(16);
//        System.out.println(myArray);
//        myArray.addEnd(4);
//        System.out.println(myArray);
//        myArray.addStart(55);
//        System.out.println(myArray);
//        myArray.addPos(1, 14);
//        System.out.println(myArray);
//        myArray.sort();
//        System.out.println(myArray);
        myArray.init(tmp);
        System.out.println(myArray);
        myArray.sort();
        System.out.println(myArray);
    }
}
