/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author nau
 */
public class Employee extends Person
{
    private int level;
    private double salary;
    public Employee(int _id, String _fName, String _lName, int _age, double _salary)
    {
        super(_id, _fName, _lName, _age);
        salary=_salary;
        level=1;
    }
    public int getLevel()
    {
        return level;
    }
    public void setLevel(int _level)
    {
        level=_level;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double _salary)
    {
        salary=_salary;
    }

    @Override
    public String getInfo()
    {
        return level+";"+salary+"";
    }
    
    @Override
    public boolean equals(Object o)
    {
        boolean result=false;
        Employee e=(Employee)o;
        if(super.equals(e))
        {
            if(e.level==this.level & e.salary==this.salary)result=true;
        }
        return result;
    }
}
