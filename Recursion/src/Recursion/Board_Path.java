package Recursion;

import java.util.Currency;

public class Board_Path {

	public static void main(String[] args) {
		print_boardpath(3, 0,"");

	}
	public static void print_boardpath(int end, int curr,String ans) {
		if(curr == end) {
			System.out.println(ans);
			return;
		}
		if(curr>end) {
			return;
		}
//		print_boardpath(end, curr+1, ans+"1");
//		print_boardpath(end, curr+2, ans+"2");
//		print_boardpath(end, curr+3, ans+"3");
//		print_boardpath(end, curr+4, ans+"4");
//		print_boardpath(end, curr+5, ans+"5");
//		print_boardpath(end, curr+6, ans+"6");
		for(int dice = 1; dice <=6; dice++) {
			print_boardpath(end, curr+dice, ans+dice);
		}
		
	}

}
