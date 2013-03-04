/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datasave_new;

import java.util.ArrayList;

/**
 *
 * @author nau
 */
public class Person
{
    private int id;
    private String fName;
    private String lName;
    private int age;
    
    public Person(int id, String fName, String lName, int age)
    {
        this.id=id;
        this.fName=fName;
        this.lName=lName;
        this.age=age;
    }
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
    @Override
    public String toString()
    {
        return "id "+this.id+" fName "+this.fName+" lName "+this.lName+" age "+this.age;
    }
    public ArrayList<String> getPersonString()
    {
        ArrayList<String> result=new ArrayList<String>();
        result.add("id "+this.id);
        result.add("fName "+this.fName);
        result.add("lName "+this.lName);
        result.add("age "+this.age);
        return result;
    }
    @Override
    public boolean equals(Object o)
    {
        Person p=(Person)o;
        boolean res=false;
        if(p!=null)
        {
            if(p.getClass()==this.getClass())
            {
                if(this.fName.equals(p.getFName())&this.lName.equals(p.getLName())
                        &this.id==p.getId()&this.age==p.getAge()) res=true;
            }
        }
        return res;
    }
}
