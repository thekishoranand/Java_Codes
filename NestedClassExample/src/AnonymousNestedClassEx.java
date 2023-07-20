class X {
	void m1() {
		System.out.println("Hello X");
	}
}
interface Y{
	void m1();
	void m2();
}
public class AnonymousNestedClassEx {
	public static void main(String[] args) {
		X x=new X(){
			void m1() {
				System.out.println("Hmnvbfsdff hsdvhgh");
			}
		};
		x.m1();
		
		Y y=new Y() {
			public void m1() {
				System.out.println("hi Incapp");
			}
			public void m2() {
				System.out.println("hello Incapp");
			}
		};
		y.m1();
		y.m2();
	}
}
