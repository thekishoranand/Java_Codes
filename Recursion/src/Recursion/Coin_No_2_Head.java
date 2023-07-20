package Recursion;

public class Coin_No_2_Head {

	public static void main(String[] args) {
		
		int n = 3;
		cointoss(n, "", false);

	}

	public static void cointoss(int n, String ans, boolean ishead) {
		// base case
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		// (Ye ham maan ke chalenge ki toss ek bar hua to n ki value kam hui aur first
		// time head/tail aaya baaki recursion khud karega)

		// head
		if (ishead == false) {
			cointoss(n - 1, ans + "H", true);
		}
		// tail
		cointoss(n - 1, ans + "T", false);
	}
}
