package com.sunbeam.employee;

import java.util.Scanner;

public class CommissionEmployee extends Employee {
	private int gross_sales;
	private double commission_rate;
	private double totalsal;
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);		
		System.out.print("enter the value of gross sales : ");
		gross_sales=sc.nextInt();
		System.out.print("enter commission rate: ");
	    commission_rate=sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("gross sales RS."+gross_sales+" commission rate : "+commission_rate);
		this.calTotalSal();
	}
	
	@Override
	public void calTotalSal() {
		totalsal=gross_sales*commission_rate/100;
		  System.out.println("TOTAL SALARY without BASE SALARY IS : "+totalsal);
	}
	
	public double getTotalsal() {
		return totalsal;
	}
	
	public void setTotalsal(double totalsal) {
		this.totalsal = totalsal;
	}
}
