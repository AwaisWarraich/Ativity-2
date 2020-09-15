package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] E1=new Employee[6];
        E1[0]=new SalariedEmployee(1,"ali",12.4,24000.00);
        E1[1]=new SalariedEmployee(2,"fahad",42.4,20000.00);
        E1[2]=new HourlyEmployee(3,"saif",13.54,8.6,56.53);
        E1[3]=new HourlyEmployee(4,"umer",16.54,5.6,43.53);
        E1[4]=new CommissionedEmployee(5,"arbab",14.33,45000.00,1200.5);
        E1[5]=new CommissionedEmployee(6,"zagham",11.33,50000.00,1500.6);
        for (int i=0;i< E1.length;i++)
        {
            System.out.println(E1[i].toString());
        }
    }
}
