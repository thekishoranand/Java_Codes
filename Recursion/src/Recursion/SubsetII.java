package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetII {

	public static void main(String[] args) {
		int []arr = {1,2,3};
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Subset_user(arr, 0, list,ans);
		System.out.println(ans);

	}
	public static void Subset_user(int[] arr, int idx, List<Integer> list, List<List<Integer>> ans) {
		ans.add(new ArrayList<>(list));
		
		for(int i = idx; i < arr.length;i++) {
			
			list.add(arr[i]);
			Subset_user(arr, i + 1, list, ans);
			list.remove(list.size() -1);
			
			while(i+1 < arr.length && arr[i] == arr[i+1]) {
				i++;
			}
		}
	}

}
