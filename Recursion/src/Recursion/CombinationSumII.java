package Recursion;


import java.util.*;

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int [] arr = {2,1,5,1,6,7,10};
		Arrays.sort(arr);
		coincombination(arr, 8,0,list,ans);
		System.out.println(ans);
	}
	public static void coincombination(int[] coin, int amount, int last_index, List<Integer> list, List<List<Integer>> ans) {
 {

		if (amount == 0) {
			ans.add(new ArrayList<>(list));
			return;
		}
			
		}
		for (int i = last_index; i < coin.length; i++) {

			if (amount >= coin[i]) {
				amount -= coin[i]; //cap
				list.add(coin[i]);
				coincombination(coin,amount ,i+1 ,list,ans); 
				list.remove(list.size()-1);
				amount += coin[i]; //cap remove
				
				while(i+1 < coin.length && coin[i] == coin[i+1]) {
					i++;
				}
			}

		}
	}
}
