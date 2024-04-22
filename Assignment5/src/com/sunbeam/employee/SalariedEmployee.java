package com.sunbeam.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	private int weeklysal; 
	
	@Override
	public void accept(Scanner sc) 
	{
		super.accept(sc);
		System.out.println("enter weekly salary");
		weeklysal=sc.nextInt();
	}
	@Override
	public void display() 
	{		
		super.display();
		calTotalSal();
	}
	
	@Override
	public void calTotalSal() 
	{
		System.out.println("weekly salary is : "+weeklysal);
	}
}
