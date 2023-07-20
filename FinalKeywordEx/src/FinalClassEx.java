final class A {
	void m1() {
		System.out.println("Hello A");
	}
	void m2() {
		System.out.println("Hi A");
	}
}
class B {
	void m1() {
		System.out.println("fgfgjfgjf tj rthrth");
	}
	void m2() {
		System.out.println("thrthytjytjyt rtj ytjyt");
	}
}
public class FinalClassEx {
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		B b= new B();
		b.m1();
		b.m2();
	}
}