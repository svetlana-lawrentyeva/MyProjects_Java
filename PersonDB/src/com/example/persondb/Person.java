package com.example.persondb;

import java.util.ArrayList;

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
    public Person()
    {
        this.id=0;
        this.fName="";
        this.lName="";
        this.age=0;
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
    public void setId(int id)
    {
    	this.id=id;
    }
    public void setFName(String fName)
    {
    	this.fName=fName;
    }
    public void setLName(String lName)
    {
    	this.lName=lName;
    }
    public void setAge(int age)
    {
    	this.age=age;
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
