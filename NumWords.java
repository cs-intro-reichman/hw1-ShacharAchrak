// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		
		int digit3 =  number % 10;
		number = number / 10;
		int digit2 =  number % 10;
		number = number / 10;
		int digit1 = number;

		System.out.println(digit1 + " hundreds, " + digit2 + " tens, and "+ digit3 + " ones.");



	}
}
