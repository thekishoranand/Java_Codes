package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
 public static void main(String[] args) {
	int[] arr = {15,11,9,13,21};
	System.out.println(Arrays.toString(arr));
	NGE(arr);
	
}
  public static void NGE(int[] arr) {
	  Stack<Integer> s = new Stack<>();
	  int ans[] = new int[arr.length];
	  for(int i = 0; i<arr.length;i++) {
		  while(!s.isEmpty() && arr[i]>arr[s.peek()]) {
			 ans[s.pop()] = arr[i];
		  }
			  s.push(i);
		  }
	  while (!s.isEmpty()) {
		ans[s.pop()] = -1;
		
	}
	  System.out.println(Arrays.toString(ans));
  }
 
}

//LEETCODE 496
//class Solution {
//public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//  int[] ans = new int[nums1.length];
//  for(int i = 0; i<nums1.length; i++)
//  {
//      ans[i] = findGreater(nums1[i], nums2);
//  }
 
//  return ans;
//}

//private int findGreater(int target, int[] nums)
//{
//  int index=0;
//  for(int i = 0;i<nums.length;i++)
//      if(nums[i] == target)
//          index = i;
//  for(int i = index+1;i<nums.length;i++)
//      if(nums[i]>target)
//          return nums[i];
//  return -1;
//}
//}
