
public class ArraysEx1 {

	public static void main(String[] args) {
		//int a[4];//error
		int a[];//array declaration
		a=new int[4];//array creation
		a[0]=12;//array initialization
		a[1]=89;
		a[2]=45;
		a[3]=8;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
		
		for(int x:a) {
			System.out.println(x);
		}
	}
}
