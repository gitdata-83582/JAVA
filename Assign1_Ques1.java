
import java.util.Scanner;
public class Assign1_Ques1 {
	public static void main(String[] args)
	{
		System.out.println("Enter the integer");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println ("Actual number is = " + num);
		System.out.println(" Binary equivalent is = " + Integer.toBinaryString(num));
		System.out.println(" Octal equivalent is = " + Integer.toOctalString(num));
		System.out.println(" Hexadecimal equivalent is = " + Integer.toHexString(num));
	}

}
