package Stack;

import java.util.Stack;

public class HistoGram {

	public static void main(String[] args) {
		int[] arr= {2,3,5,4,6,1,7};

	}
	public static int Area(int[] arr) {
		int i = 0;
		int maxarea = 0;
		Stack<Integer> st  = new Stack<>();
		while(i<arr.length) {
			if(st.isEmpty()|| arr[i]>arr[st.peek()]) {
				st.push(i);
				i++;
			}
				else{
					int h = arr[st.pop()];
					int r = i;
					if(st.isEmpty()) {
						int pararea = h*r;
						maxarea = Math.max(pararea,maxarea ); 
						
					}
					else {
						int l = st.peek();
						int pararea = h*(r-l-1);
						maxarea= Math.max(pararea,maxarea);
					}
			}
		}
	}

}
