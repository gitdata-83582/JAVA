package com.sunbeam.employee;

import java.util.Scanner;

public class BasepluseCommissionEmployee extends CommissionEmployee{
	private double base_salary;

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("enter base salary : ");
		base_salary=sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Base salary : RS."+base_salary);
		this.calTotalSal();
	}

	@Override
	public void calTotalSal() {
		super.calTotalSal();
			setTotalsal(getTotalsal()+base_salary);
			System.out.println("total salary is : RS."+getTotalsal());
		}
	
	  	public void reward() 
	  	{
	  		base_salary=base_salary*0.10+base_salary;
	  	}	
}
