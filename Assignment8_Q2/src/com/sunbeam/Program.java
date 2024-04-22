package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Student[] arr = new Student[5];
		arr[0]=new Student(2,"balkisan","malkapur",60);
		arr[1]=new Student(1,"abhishek","karad",80);
		arr[2]=new Student(4,"shreyash","yavatmal",70);
		arr[3]=new Student(5,"kapil","khandesh",50);
		arr[4]=new Student(3,"jay","mumbai",90);
		int choice;;
		
		Scanner sc = new Scanner(System.in);
		
		class StudentCity implements Comparator<Student> {
			@Override
			public int compare(Student o1, Student o2) {

				return o1.getCity().compareTo(o2.getCity());
			}
		}

		Comparator<Student> s1 = new StudentCity();
		
		

		class StudentMarks implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {

				return Double.compare(o2.getMarks(), o1.getMarks());
			}
		}

		Comparator<Student> s2 = new StudentMarks();
		
		
		

		class StudentNames implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getName().compareTo(o2.getName());
			}
		}

		Comparator<Student> s3 = new StudentNames();
		
		
		

	do {
		System.out.println("1. sorted on their city (asc)");
		System.out.println("2. sorted on their on marks (desc) ");
		System.out.println("3. sorted on their on name (asc)");
		System.out.println("4.sort on rollno");
		
		System.out.print("enter choice");
		choice=sc.nextInt();
		
		switch(choice) {
			
		case 0:
			System.out.println("Thank you...");
			break;
		
		case 1:
			System.out.println("Before sort city ");
			for(Student s:arr)
				System.out.println(s);
			Arrays.sort(arr, s1);
			System.out.println("After sort city in Asc ");
			for(Student s:arr)
				System.out.println(s);
			break;
			
		case 2:
			System.out.println("Before sort mark ");
			for(Student s:arr)
				System.out.println(s);
			Arrays.sort(arr, s2);
			System.out.println("Afetr sort mark in Desc");
			for(Student s:arr)
				System.out.println(s);
			break;
			
		case 3:
			System.out.println("Before sort name ");
			for(Student s:arr)
				System.out.println(s);
			Arrays.sort(arr, s3);
			System.out.println("Afetr sort name in Asc");
			for(Student s:arr)
				System.out.println(s);
			break;
			
		default :
			System.out.println("Invalid choice..!");
			
		}
	}while(choice!=0);
	sc.close();
	}
}
