package Recursion;

public class Generate_Parentheses {

	public static void main(String[] args) {
		int n = 3;
		GenerateParenthesis(n, 0, 0,"");

	}
	public static void GenerateParenthesis(int n, int open, int close, String ans) {
		//base case
		if(open == n && close == n) {
			System.out.println(ans);
			return;
		}
		//opening
		if(open<n) {
			GenerateParenthesis(n, open+1, close, ans+"(");
		}
		//clsoing
		if(close<open) {
			GenerateParenthesis(n, open, close+1, ans+")");
		}
	}

}
