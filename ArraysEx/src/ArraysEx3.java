import java.util.Scanner;
public class ArraysEx3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array Size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int x=0;x<a.length;x++) {
			System.out.println("Enter a No. :");
			a[x]=sc.nextInt();
		}
		
		System.out.println("All elements Are:");
		for(int x:a) {
			System.out.println(x);
		}
	}
}
