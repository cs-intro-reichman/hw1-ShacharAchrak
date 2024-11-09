// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		double number = Double.parseDouble(args[0]);
		
		int digit3 = (int) number % 10;
		number = number / 10;
		int digit2 = (int) number % 10;
		number = number / 10;
		int digit1 = (int) number % 10;
		number = number / 10;

		System.out.println(digit1 + " hundreds, " + digit2 + " tes, "+ digit3 + " ones.");



	}
}
