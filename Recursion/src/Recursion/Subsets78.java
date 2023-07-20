package Recursion;

import java.util.*;


public class Subsets78 {

	public static void main(String[] args) {
		int []arr = {1,2,3};
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		subSet_ele(arr, 0, list,ans);
		System.out.println(ans);

	}
	public static void subSet_ele(int[] arr, int idx, List<Integer> list, List<List<Integer>> ans) {
		if(idx == arr.length) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		subSet_ele(arr, idx + 1, list, ans); //no
		list.add(arr[idx]);
		subSet_ele(arr, idx + 1, list, ans); //yes
		list.remove(list.size()-1);
		
	}

}
