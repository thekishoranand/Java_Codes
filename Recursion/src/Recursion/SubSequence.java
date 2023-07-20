package Recursion;

public class SubSequence {
public static void main(String[] args) {
	SubSeq("abc", "");
}
public static void SubSeq(String ques, String ans) {
	if(ques.length() == 0) {
		System.out.print(ans +" ");
		return ;
	}
	char ch = ques.charAt(0);

	
	SubSeq(ques.substring(1), ans + ch); // yes
	SubSeq(ques.substring(1), ans); //no
}
}
