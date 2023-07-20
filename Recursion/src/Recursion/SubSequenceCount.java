package Recursion;

public class SubSequenceCount {
	public static void main(String[] args) {
		SubSeq("abc", "");
		System.out.println();
		System.out.println(SubSeqCount("abc",""));
	}
	public static void SubSeq(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.print(ans +" ");
			return ; 
		}
		char ch = ques.charAt(0);
        SubSeq(ques.substring(1), ans); //no
		SubSeq(ques.substring(1), ans + ch); // yes
		
	}

	

	public static int SubSeqCount(String ques, String ans) {
		if (ques.length() == 0) {
			// System.out.print(ans +" ");
			return 1;
		}
		char ch = ques.charAt(0);
		int ex = SubSeqCount(ques.substring(1), ans); //no
		int inc =SubSeqCount(ques.substring(1), ans + ch); // yes
		  return ex + inc;

	}
}
