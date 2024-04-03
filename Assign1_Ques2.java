import java.util.Scanner;

public class Assign1_Ques2 
{
	public static void main(String[] args)
	{
		System.out.println("Enter First Double Number");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
			{
				System.out.println("Number not Double ");
			}
		
	
	
			double num1 = sc.nextDouble();
		
		
		System.out.println("Enter Second Double Number " );
	
		if(sc.hasNextInt())
			{
				System.out.println("Number not Double ");
			}
		
			double num2=sc.nextDouble();
		
			double average = (num1 + num2) / 2 ;
		{
			System.out.println("Average : " + average );
		}
	}}
	


