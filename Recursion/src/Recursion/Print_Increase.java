package Recursion;

public class Print_Increase {

	public static void main(String[] args) {
		pI(5);

	}

	public static void pI(int n) {
		if (n == 0) {
			return;
		}

		pI(n - 1);
		System.out.println(n);

	}

}
