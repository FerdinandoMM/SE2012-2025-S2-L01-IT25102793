import java.util.Scanner;

public class Welcome {
	public static void main ( String[] args ) {
		Scanner scanner = new Scanner ( System.in );
		System.out.print ( "\nEnter your First Name: " );
		String firstName = scanner.nextLine();
		System.out.print ( "Enter your Last Name: " );
		String lastName = scanner.nextLine();
		System.out.printf ( "\nWelcome to the Second Year %s %s!\n", firstName, lastName );
	}
}
