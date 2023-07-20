package Recursion;

import java.util.*;

public class GenerateParentheses_Leetcode {

	public static void main(String[] args) {
		
	
		//to store the value in list as given in leetcode
		List<String> list = new ArrayList<>(); 
		GenerateParentheses_Leetcode(3, 0, 0,"",list);
		System.out.println(list);

	}
	public static void GenerateParentheses_Leetcode(int n, int open, int close, String ans,List<String> list) {
		//base case
		if(open == n && close == n) {
		//	System.out.println(ans);
			list.add(ans);
			return;
		}
		//opening
		if(open<n) {
		GenerateParentheses_Leetcode(n, open+1, close, ans+"(",list);
		}
		//clsoing
		if(close<open) {
			GenerateParentheses_Leetcode(n, open, close+1, ans+")", list);
		}
	}

}
