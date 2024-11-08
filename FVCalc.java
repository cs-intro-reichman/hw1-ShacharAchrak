
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

	double futureValue = Math.pow((1 + rate/100), n)* currentValue;
	int x = (int) futureValue;

		System.out.println("After " + n + " years, a $" + currentValue + " saved at " + rate + "% will yield $" + x);   

	}
}