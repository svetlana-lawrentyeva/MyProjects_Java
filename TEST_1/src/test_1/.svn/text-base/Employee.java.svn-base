package test_1;

import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Employee implements Comparable<Employee>
{
    private static int idCount=0;
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    public Employee(String _firstName, String _lastName, double _salary)
    {
        this.id=idCount++;
        this.firstName=_firstName;
        this.lastName=_lastName;
        this.salary=_salary;
    }
    public Employee(String str)
    {
        String[]arr=str.split("~");        
        this.id=Integer.parseInt(arr[0]);
        this.firstName=arr[1];
        this.lastName=arr[2];
        this.salary=Double.parseDouble(arr[3]);
    }
    public int getId()
    {
        return this.id;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void setFirstName(String _firstName)
    {
        this.firstName=_firstName;
    }
    public void setLastName(String _lastName)
    {
        this.lastName=_lastName;
    }
    public void setSalary(double _salary)
    {
        this.salary=_salary;
    }
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName()+"^"+this.id+"~"+this.firstName+"~"+this.lastName+"~"+this.getAverageSalary();
    }
    @Override
    public int compareTo(Employee em)
    {
        return (int)(this.getAverageSalary()-em.getAverageSalary());
    }
    public abstract double getAverageSalary();
}
