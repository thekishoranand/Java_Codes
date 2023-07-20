package Recursion;

public class FirstOccurence {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 5, 6, 2, 4, 6, 9 };
		System.out.println(index(arr, 2, 0));
	}

	public static int index(int[] arr, int item, int i) {
		{
			// -ve base case
			if (i == arr.length - 1) {
				return -1;
			}
			// +ve base case
			if (arr[i] == item) {
				return i;
			}
			return index(arr, item, i + 1);
		}

	}

}
