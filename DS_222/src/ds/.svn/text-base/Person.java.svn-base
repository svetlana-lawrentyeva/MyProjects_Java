/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

import java.io.IOException;

/**
 *
 * @author nau
 */
public abstract class Person
{
    private int id;
    private String fName;
    private String lName;
    private int age;
    
    public Person(int _id, String _fName, String _lName, int _age)
    {
        id=_id;
        fName=_fName;
        lName=_lName;
        age=_age;
    }
    public abstract String getInfo();
    public int getId()
    {
        return id;
    }
    public String getFName()
    {
        return fName;
    }
    public String getLName()
    {
        return lName;
    }
    public int getAge()
    {
        return age;
    }
    public String toCSV()
    {
        return this.getClass().getName()+";"+id+";"+fName+";"+lName+";"+age+";"+getInfo();
    }
    public static Person fromCSV(String str)
    {
        String[]strArray=str.split(";");
        Person p;
        if(strArray[0].equals(Employee.class.getName()))
        {
            p=new Employee(Integer.parseInt(strArray[1]), strArray[2],
                    strArray[3], Integer.parseInt(strArray[4]), Double.parseDouble(strArray[6]));
            ((Employee)p).setLevel(Integer.parseInt(strArray[5]));
        }
        else if(strArray[0].equals(Client.class.getName()))
        {
            p=new Client(Integer.parseInt(strArray[1]), strArray[2],
                    strArray[3], Integer.parseInt(strArray[4]));
            ((Client)p).setDiscount(Integer.parseInt(strArray[5]));
        }
        else throw new NoClassDefFoundError();
        return p;
    }
    
    @Override
    public boolean equals(Object o)
    {
        boolean result=false;
        Person p=(Person)o;
        if(this.id==p.id & this.fName.equals(p.fName) &
                this.lName.equals(p.lName) & this.age==p.age)result=true;
        return result;
    }
}
