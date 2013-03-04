package test_1;

public class EmployeeByHour extends Employee
{    
    public EmployeeByHour(String _firstName, String _lastName, double _salary)
    {
        super(_firstName,_lastName,_salary);
    }
    @Override
    public double getAverageSalary()
    {
        return 20.8*8*this.getSalary();
    }
    
}
