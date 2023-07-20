class A{
	int x=10;
	public void m1() {
		System.out.println("Hello A");
	}
	static void m2() {
		System.out.println("Hi A");
	}
}
class B extends A{
	int y=20;
	int x=90; //data hiding
	public void m1() { //method overriding
		System.out.println("INCAPP");
	}
	static void m2() { //method hiding
		System.out.println("Hi B");
	}
}
public class OverridingHidingEx {
	public static void main(String[] args) {
		A.m2();
		B.m2();
		B b = new B();
		System.out.println(b.x);
		b.m1();
		A a=new A();
		System.out.println(a.x);
		a.m1();
	}	
}
