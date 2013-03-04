package test_1;

import java.util.ArrayList;
import java.util.Collections;

public class TEST_1
{
    public static void main(String[] args)
    {
        ArrayEmployee arr=new ArrayEmployee();
        arr.LoadFile();
//        ArrayEmployee arr = new ArrayEmployee();
//        arr.add(new EmployeeByHour("Tom", "Cat", 100.02));
//        arr.add(new EmployeeFix("Greg", "Dpg", 12000));
//        arr.add(new EmployeeByHour("Tim", "Bird", 170.50));
//        arr.add(new EmployeeFix("Little", "Mouse", 17000));
//        for(Employee em:arr)
//        {
//            System.out.println(em.toString());
//        }
//        System.out.println();
//        Collections.sort(arr,new SortComparator());
//        for(Employee em:arr)
//        {
//            System.out.println(em.toString());
//        }
//        System.out.println();
//        Collections.sort(arr,new SortComparatorByName());
        for(Employee em:arr)
        {
            System.out.println(em.toString());
        }
        arr.saveFile();
    }
}
