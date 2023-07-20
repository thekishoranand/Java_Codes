package Recursion;


public class Fact_Tail {

	public static void main(String[] args) {
	System.out.println(fact(5,1));

	}
	public static int fact(int n, int ans) {
		//*Head Recursion*
		//Base condition
		if(n==0 || n==1) {
			return ans;
		}
		// smaller problem
		//self work
		return fact(n-1, n*ans);
	}

}
