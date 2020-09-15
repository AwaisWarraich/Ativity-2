package com.company;

public class Employee {
    private int empId;
    private String name;
    private double taxRate;
    public Employee()
    {
        setEmpId(1);
        setName("Fahad");
        setTaxRate(22.4);
    }
    public Employee(int empId,String name,double taxRate)
    {
        setTaxRate(taxRate);
        setName(name);
        setEmpId(empId);
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    public double calculateSalary()
    {
        return 0.0;
    }
    public String toString()
    {
        return "The Salery is "+calculateSalary();
    }
}
