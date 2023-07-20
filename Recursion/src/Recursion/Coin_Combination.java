package Recursion;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		coincombination(coin, amount, "",0);

	}
	//*infinte supply of the coins are there*
	public static void coincombination(int[] coin, int amount, String ans, int last_index) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = last_index; i < coin.length; i++) {

			if (amount >= coin[i]) {// tabhi coin pick karenge
				// amount -= coin[i];
				coincombination(coin, amount - coin[i], ans + coin[i], i); //no backtracking 
				// coinpermutation(coin, amount, ans + coin[i]);
				// amount += coint[i];   // Agar frame me change hoga to recursion use retrive ni kar payega to
				// backtracking use hoga yha
			}

		}
	}
}
