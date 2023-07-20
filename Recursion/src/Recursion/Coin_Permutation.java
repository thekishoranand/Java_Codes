package Recursion;

public class Coin_Permutation {

	public static void main(String[] args) {

		int[] coin = { 2, 3, 5 };
		int amount = 10;
		coinpermutation(coin, amount, "");

	}

	public static void coinpermutation(int[] coin, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coin.length; i++) {

			if (amount >= coin[i]) {// tabhi coin pick karenge
				// amount -= coin[i];
				coinpermutation(coin, amount - coin[i], ans + coin[i]); //no backtracking 
				// coinpermutation(coin, amount, ans + coin[i]);
				// amount += coint[i];   // Agar frame me change hoga to recursion use retrive ni kar payega to
				// backtracking use hoga yha
			}

		}
	}
}
