import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string;
		System.out.println("Enter string ");
		string = sc.nextLine();
		StringBuffer s1 = new StringBuffer(string);
		s1.reverse();
		if (string.equals(s1.toString())) {
			System.out.println("Is palindrome..");
		} else {
			System.err.println("Is not palindrome");
		}
		sc.close();
	}
}
