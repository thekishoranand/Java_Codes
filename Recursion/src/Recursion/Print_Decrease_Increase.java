package Recursion;

public class Print_Decrease_Increase {

	public static void main(String[] args) {
	pDI(5);

	}
	public static void pDI(int n) {
		if(n==0) {
			return;
		}
		
		  System.out.println(n);
		pDI(n-1);
		System.out.println(n);
	}
}
