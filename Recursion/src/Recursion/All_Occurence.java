package Recursion;

public class All_Occurence {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 5, 6, 2, 4, 6, 9 };
	    index(arr, 2, 0);
	}

// return type void denge kyouki hme value print karaani hai
	public static void index(int[] arr, int item, int i) {
		{
			// -ve base case
			if (i == arr.length - 1) {
				return;
			}
			// +ve base case
			if (arr[i] == item) {

				System.out.println(i + " ");

			}
			index(arr, item, i + 1);
		}

	}

}
