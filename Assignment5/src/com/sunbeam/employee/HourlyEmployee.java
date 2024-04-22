package com.sunbeam.employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private int wage;
	private int hours;
	private double totalsal;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.print("Enter the wage per hour : ");
		wage=sc.nextInt();
		System.out.print("Enter number of hours employee worked for : ");
		hours=sc.nextInt();
	}
	
	@Override
	public void calTotalSal() {
		if(hours<=40)
		{
			totalsal=wage*hours;
		}
		else
		{
			totalsal=(40*wage)+(hours-40)*wage*1.5;
		}
     System.out.println("TOTAL SALARY IS : "+totalsal);
	}
	

	@Override
	public void display() {
		super.display();
		calTotalSal();
	}
	
	
	
}
