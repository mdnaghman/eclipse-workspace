package types;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		try {
		Scanner obj = new Scanner(System.in);
		
		String stringWithoutSpaces = inputString.replaceAll("\\s+");
		System.out.print("Enter your name: " +inputString );
		String ab = obj.nextLine().trim();
		System.out.println("Your name is: " + ab);
		
		System.out.print("Enter your age: " );
		int ab2  = obj.nextInt();
		System.out.println("your age is: " +  ab2 );
		
		obj.nextLine();
		
		System.out.println("Enter your address: ");
		String address = obj.nextLine();
		System.out.println("your address is: " + address);
		}
		finally {
		}
	}

}
