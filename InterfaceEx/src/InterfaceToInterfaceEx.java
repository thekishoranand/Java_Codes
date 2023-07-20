interface A{
	void m1();
	void m();
}
interface B{
	void m2();
	void m();
}
interface C extends A{
	void m3();
}
class X implements C,B{

	public void m1() {
		System.out.println("Hi X");
	}

	public void m2() {
		System.out.println("Hello X");
	}

	public void m() {
		System.out.println("Ok X");
	}

	public void m3() {
		System.out.println("Incapp X");
	}
}
public class InterfaceToInterfaceEx {
	public static void main(String[] args) {
		A a=new X();
		a.m1();
		a.m();
		//a.m2();//error
		//a.m3();//error
		B b=new X();
		b.m2();
           		b.m();
		//b.m1();//error
		//b.m3();//error
		C c=new X();
		c.m1();
		c.m3();
		c.m();
		//c.m2();//error
		X x=new X();
		x.m1();
		x.m2();
		x.m3();
		x.m();
	}
}

 