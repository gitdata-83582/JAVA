import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String s1=sc.nextLine();
		
		s1.trim();
		
		String arr[]=s1.split(" ");
		for(String e:arr) {
			System.out.println(e);
			count++;
		}
		System.err.println("count of string is: "+count);
		sc.close();
	}

}
