package Recursion;

public class Print_Decrease {

	public static void main(String[] args) {
		pd(5);

	}
	public static void pd(int n) {
		if(n==0) {
			return;
		}
		
		  System.out.println(n);
		pd(n-1);
	}

}
