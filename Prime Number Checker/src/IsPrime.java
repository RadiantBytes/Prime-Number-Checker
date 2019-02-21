
/**
 * This program determines if the user's number is prime or not. If it
 *  is not prime, the program will determine all of the number's 
 *  divisors 
 * 
 * Last Modified: October 11, 2016
 * @author: Thomas "RadiantBytes" Lyanugh
 */
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// Declares variables
		int numPrime = 0;
		int x;

		// Declares new scanner
		Scanner scan = new Scanner(System.in);

		// Prompt for user's number
		System.out.print("Enter a number to check: ");
		int userNumber = scan.nextInt();

		do {
			if (userNumber <= 1) {
				System.out.println("Error: Please enter a number greater than 1.");
				System.out.print("Enter a number to check: ");
				userNumber = scan.nextInt();
			}
		} while (userNumber <= 1);

		// Determines divisors of user's number
		for (x = 2; x < userNumber; x++) {
			if (userNumber % x == 0) {
				System.out.println("## " + userNumber + " is composite. Divisible by " + x);
				numPrime++;
			}

			// Prints if user's number is prime
		}
		if (numPrime == 0) {
			System.out.print("## " + userNumber + " is prime!");
			return;

			// Prints if user's number is not prime
		}
		if (userNumber > 0) {
			System.out.println("## " + userNumber + " is not prime. 
					   It is divisible by " + numPrime + " other numbers.");
		}

	}
}
