class A{
	int x=10;
	void m1() {
		System.out.println("Hello A");
	}
}
class C{
	int z=30;
	void m3() {
		System.out.println("Hello C");
	}
}
class B {
	int y=20;
	A a=new A();
	C c=new C();
	void m2() {
  		System.out.println("Hello B");
		System.out.println(y);
		//System.out.println(x);//error
		System.out.println(a.x);
		a.m1();
		System.out.println(c.z);
		c.m3();
	}
}
public class NestedObjectEx {
	public static void main(String[] args) {
		B b= new B();
		System.out.println(b.y);
		b.m2();
		//System.out.println(b.x);//error
		System.out.println(b.a.x);
		b.a.m1();
		System.out.println(b.c.z);
		b.c.m3();
	}
}
