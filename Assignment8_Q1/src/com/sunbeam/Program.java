package com.sunbeam;

import java.util.Comparator;

public class Program {

	public static <T> void selectionSort(T[] arr, Comparator<? super T> c) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {

		Student[] arr = new Student[5];
		arr[0] = new Student(2, "balkisan", "malkapur", 60);
		arr[1] = new Student(1, "abhishek", "karad", 80);
		arr[2] = new Student(4, "shreyash", "yavatmal", 70);
		arr[3] = new Student(5, "kapil", "khandesh", 50);
		arr[4] = new Student(3, "jay", "mumbai", 90);

		class StudentRollno implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getRoll() - o2.getRoll();
			}
		}
		
		Comparator<Student> s1 = new StudentRollno();
		
		System.out.println("Before sorting :");

		for (Student element : arr) {
			System.out.println(element);
		}

		Program.<Student>selectionSort(arr, s1);

		System.out.println("After sorting :");
		for (Student element : arr) {
			System.out.println(element);
		}
	}
}
