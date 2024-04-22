package com.sunbeam.employee;

import java.util.Scanner;

public abstract class Employee {
	private String name;
	private int SSN;

	public void accept(Scanner sc) {
		System.out.print("Enter full name: ");
		name = sc.next();
		sc.nextLine();
		System.out.println("Enter SSN");
		SSN = sc.nextInt();
	}

	public void display() {
		System.out.println("name: "+name+"SSN: "+SSN);
	}
	
	public abstract void calTotalSal();
}
