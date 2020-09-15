package com.company;

public class SalariedEmployee extends Employee {
    private double salary;



    public SalariedEmployee(int empId, String name, double taxRate, double salary) {
        super(empId, name, taxRate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double calculateSalary()
    {
        return (getSalary()*getTaxRate())-getSalary();
    }
    @Override
    public String toString()
    {
        return "The Salary of "+getName()+" is "+calculateSalary();
    }
}
