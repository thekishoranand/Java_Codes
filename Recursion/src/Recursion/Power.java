package Recursion;

public class Power {
public static void main(String[] args) {
	System.out.println(power(2,5));
}
public static int power(int a, int b) {
	if(b==0) {
		return 1;
	}
	int ans = power(a, b-1);
	return a*ans;
}
}
