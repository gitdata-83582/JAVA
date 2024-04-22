import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String string;
		System.out.println("Enter string ");
		string=sc.nextLine();
		StringBuffer s1=new StringBuffer(string);
		StringBuffer s=(StringBuffer)s1.reverse();
		System.out.println(s);
		sc.close();
	}
}