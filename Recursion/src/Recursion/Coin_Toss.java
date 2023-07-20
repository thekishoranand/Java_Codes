package Recursion;

public class Coin_Toss {

	public static void main(String[] args) {
		int n = 3;
		cointoss(n, "");
	}

	public static void cointoss(int n, String ans) {
		// base case
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		// (Ye ham maan ke chalenge ki toss ek bar hua to n ki value kam hui aur first
		// time head/tail aaya baaki recursion khud karega)

		// head
		cointoss(n - 1, ans + "H");
		// tail
		cointoss(n - 1, ans + "T");
	}
}
