import java.util.Scanner;
public class ArraysEx4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[];
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		a=new int[n];
		for(int x=0;x<a.length;x++) {
			System.out.println("Enter a No. :");
			a[x]=sc.nextInt();
		}
		int sum=0;
		for(int x:a) {
			sum += x;
		}
		System.out.println("Sum of Elements is: "+sum);
	}
}
