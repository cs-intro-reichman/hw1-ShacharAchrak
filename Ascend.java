// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		int a = (int)((Math.random()* Integer.parseInt(args[0]) ));
		int b = (int)((Math.random()* Integer.parseInt(args[0]) ));
		int c = (int)((Math.random()* Integer.parseInt(args[0]) ));
		int x = (int) Math.min(a, b);
		int min = (int) Math.min(x, c);

		int y = (int) Math.max(a, b);
		int max = (int) Math.max(y, c);

		int middle =(int)(a + b + c) -(min + max); 

		
		System.out.println(min + " " + middle + " "+ max);
	}
}
