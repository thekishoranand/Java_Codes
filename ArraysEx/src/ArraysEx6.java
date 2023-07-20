public class ArraysEx6 {
	public static void main(String[] args) {
		int a[]= {4,43,5,6,8,53,6,8,4,82,6};
		System.out.println(a[2]);//5
		show(a);
		System.out.println(a[2]);//90
		
		display(a[2]);
		System.out.println(a[2]);//90
	}
	static void show(int h[]) {//call by reference
		for(int x:h) {
			System.out.println(x);
		}
		h[2]=90;
	}
	static void display(int y) {//call by value
		System.out.println(y);//90
		y=30;
		System.out.println(y); //30
	}
}
