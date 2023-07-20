package Recursion;



public class LexiCo_Count {

	public static void main(String[] args) {
		lexco_Counting(0, 10);

	}

public static void lexco_Counting(int curr, int end) {
	 if(curr>end) {
		 return;
	 }
	  System.out.println(curr);
	 
	 //Agar curr ki val 0 hai to 9 time loop else 10 times if curr!=0 
	  int i = 0;
	  if(curr == 0) {
		  i=1;   
	  }
	  for(; i <=9 ;i++) {
		  lexco_Counting(curr*10 + i, end);
	  }
  }
}
