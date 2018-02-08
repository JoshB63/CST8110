import java.util.Scanner;	

public class JavaMain {
	public static void main (String args[]) {

		Scanner input = new Scanner (System.in);

		float number = 0.0;
		System.out.println("This program will produce a printout of three numbers after the entered number. Enter the number:");

		number = input.nextFloat();

		System.out.println  ("The first three numbers after " +number+" are:");
		System.out.println  (number+1);
		System.out.println  (number+2);
		System.out.println  (number+3);

	} // end of main
}// end of class
