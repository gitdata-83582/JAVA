package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.employee.*;

public class Tester {

	public static void main(String[] args) {
		int choice;

		Scanner sc = new Scanner(System.in);
		Employee e = null;
		System.out.println(" 0.EXIT ");
		System.out.println(" 1.CHECK SALARY OF SALARIED_EMPLOYEES ");
		System.out.println(" 2.CHECK SALARY OF HOURLY_EMPLOYEES");
		System.out.println(" 3.CHECK SALARY OF COMMISION_EMPLOYEES");
		System.out.println(" 4.CHECK SALARY OF BASE_SALARIED_EMPLOYEES");
		System.out.print("enter choice : ");
		choice = sc.nextInt();

		switch (choice) {
		case 0:
			System.out.println("Thanks");
			break;

		case 1: {
			e = new SalariedEmployee();
			e.accept(sc);
			e.display();
		}
			break;

		case 2: {
			e = new HourlyEmployee();
			e.accept(sc);
			e.display();
		}
			break;

		case 3: {
			e = new CommissionEmployee();
			e.accept(sc);
			e.display();
		}
			break;

		case 4: {
			e = new BasepluseCommissionEmployee();
			e.accept(sc);
			e.display();
			System.out.println("Press 1 for giving 10% on base salary");
			choice = sc.nextInt();
			if (choice == 1) {
				if (e instanceof BasepluseCommissionEmployee) {
					BasepluseCommissionEmployee l = (BasepluseCommissionEmployee) e;
					l.reward();
					System.out.println("salary after giving reward");
					l.calTotalSal();
				}
			}
		}
			break;

		default:
			System.out.println("Enter a valid choice");
			break;
		}
	}
}
