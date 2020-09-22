package j_exceptions;

import java.util.Scanner;

/*
 * UnChecked Exceptions also called as "Runtime exceptions"
 * exception which can be unexpected
 * we shall handle using try and catch block
 */
public class Learn2_UncheckedException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input: ");
		String input = scanner.nextLine();

		//System.out.println("program ends");
		printFirstChar(input);
		scanner.close();

	}

	public static void printFirstChar(String s) {
		// print first character of a String
		try {
			System.out.println(s.charAt(0));
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("User input is Empty");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Something went wrong. please again with differnt input");
		} 
		  finally {
			System.out.println("Inside finally");
			// closing an open connection db conn, third party file
		}
		
		// Error
		// Exception

	}
}
