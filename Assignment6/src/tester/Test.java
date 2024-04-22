package tester; 

import java.util.Scanner;

import com.sunbeam.ExceptionLineTooLong;

public class Test {
	
	public static void main(String[] args) {
		String string;
		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("Enter string");
			string=sc.nextLine();
			if(string.length()>80) {
				throw new ExceptionLineTooLong("string length is not be more than 80 character");
			}	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Program succefully executed");
	}
}
