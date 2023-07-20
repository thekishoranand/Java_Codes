package Recursion;

import java.util.*;

public class LeetCode39 {

	public static void main(String[] args) {
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		List<Integer> list = new ArrayList<>(); // 1-D List
		List<List<Integer>> ans = new ArrayList<>();// 2-D List
		coincombination(coin, amount, 0, list, ans);
		System.out.println(ans);
	}

	public static void coincombination(int[] coin, int amount, int last_index, List<Integer> list,
			List<List<Integer>> ans) {

		if (amount == 0) {
			//ans.add(list);\
			ans.add(new ArrayList<>(list)); //Other loc pe list store karne ke liye
			return;
		}
		for (int i = last_index; i < coin.length; i++) {

			if (amount >= coin[i]) {// tabhi coin pick karenge
				amount -= coin[i];// cap
				list.add(coin[i]);
				coincombination(coin, amount, i, list, ans);
				list.remove(list.size() - 1);
                amount += coin[i]; // Cap Remove
			}

		}

	}
}








//LEETCODE 40

//class Solution {
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//			Arrays.sort(candidates);
//         List<Integer> list = new ArrayList<>(); // 1-D List
//		List<List<Integer>> ans = new ArrayList<>();// 2-D List
//		coincombination(candidates, target, 0, list, ans);
//		return ans;
//    }
//    public static void coincombination(int[] candidates, int target, int last_index, List<Integer> list,
//			List<List<Integer>> ans) {
//
//		if (target == 0) {
//			ans.add(new ArrayList<>(list)); //Other loc pe list store karne ke liye
//				return;
//		}
//		for (int i = last_index; i < candidates.length; i++) {
// 
//			if (i > last_index && candidates[i] == candidates[i-1]) continue;
//			  target -= candidates[i];// cap
//				list.add(candidates[i]);
//				coincombination(candidates, target, i+1, list, ans);
//				list.remove(list.size() - 1);
//				target += candidates[i]; // Cap Remove
//			}
//
//		}
//
//	}
//
