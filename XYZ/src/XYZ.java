class D{}  //D.class
public class XYZ {  //XYZ.class
	class A{		//XYZ$A.class
		class B{}	//XYZ$A$B.class
		class C{}	//XYZ$A$C.class
	}
	void m1() {
		class B{}	//XYZ$1B.class
		class D{}	//XYZ$1D.class
		B b=new B() {};	//XYZ$1.class
		B b2=new B();
		D d=new D() {};	//XYZ$2.class
	}
	XYZ(){
		class B{}	//XYZ$2B.class
		class E{}	//XYZ$1E.class
	}
	A a=new A() {};	//XYZ$3.class
	A a2=new A() {};	//XYZ$4.class
}
 