package Recursion;


public class Factorial {

	public static void main(String[] args) {
	System.out.println(fact(5));

	}
	public static int fact(int n) {
		//*Head Recursion*
		//Base condition
		if(n==0 || n==1) {
			return 1;
		}
		// smaller problem
		int f = fact(n-1);
		//self work
		return n*f;
	}

}
