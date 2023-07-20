class A{
	static int x=10;
	int h=10;
	void m1() {
		System.out.println("Hello A");
	}
}

class B extends A{
	int y=20;
	void m2() {
		System.out.println("Hello B");
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		A a= new A();
		a.x=15;
		a.h=15;
		System.out.println(a.x);
		System.out.println(a.h);
		a.m1();
		B b = new B();
		System.out.println(b.x);
		System.out.println(b.h);
		b.m1(); 
		System.out.println(b.y);
		b.m2();
	}
}