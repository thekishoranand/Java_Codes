package Recursion;

public class Maze_path {

	public static void main(String[] args) {
	print_path(0, 0, 2, 2,""); 

	}
	public static void print_path(int cc, int cr, int ec, int er, String ans) {
		if(cc == ec && cr == er) {
		System.out.println(ans);
		return;
		}
		if(cc>ec || cr > er) {
			return;
		}
		print_path(cc , cr + 1, ec, er, ans+"H");
		print_path(cc + 1, cr, ec, er, ans +"V");
	}

}
