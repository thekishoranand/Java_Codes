package Recursion;
import java.util.*;
import java.io.*;
public class PalindromePartitioning {
	public static void main(String[] args) {
		String str = "nitin";
      solution(str, "");
	}
	public static boolean isPalindrome(String str) {
		int li = 0; //left index
		int ri = str.length() -1; //right index
		while(li < ri) {
			char left = str.charAt(li);
			char right = str.charAt(ri);
			if(left != right) {
				return false;
			}
			li++;
			ri++;
		}
		return true;
		
	}
	public static void solution(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for(int i =0 ; i<str.length();i++) {
			String prefix = str.substring(0,i+1) ; // 0 to i tk substring dega
			String ros = str.substring(i+1);
			if(isPalindrome(prefix)) {
				solution(ros, ans + "(" + prefix + ")");
			}
		}
	}
}
