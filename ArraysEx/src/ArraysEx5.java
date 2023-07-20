class A{
	int x=10;
	void m1() {
		System.out.println("Hello A");
	}
}
public class ArraysEx5 {
	public static void main(String[] args) {
 //     A a=new A();
//		A b=new A();
//		A c=new A();
//		A d=new A();
//		A e=new A();
		A a[]=new A[5];
		a[0]=new A();
		a[1]=new A();
		a[2]=new A();
		a[3]=new A();
		a[4]=new A();
		
		
		A aa[]=new A[] {new A(),new A(),new A(),new A(),new A()};
		A aaa[]={new A(),new A(),new A(),new A(),new A()};
		
		A aaaa[]=new A[5];
		for(int x=0;x<aaaa.length;x++) {
			aaaa[x]=new A();
		}
		System.out.println(a[2].x);
		System.out.println("Hello A");
	}
}


