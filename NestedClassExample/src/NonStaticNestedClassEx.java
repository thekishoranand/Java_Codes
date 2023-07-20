class A{
	int x=10;
	private int k=20;
	static int j=30;
	void m1() {
		 System.out.println("Hi A");
		 System.out.println(x);
		 System.out.println(k);
		 System.out.println(j);
		 //System.out.println(y);//error
		 //System.out.println(z);//error
		 System.out.println(B.z);
		 B b=new B();
		 System.out.println(b.y);
	}
	class B{
		int y=25;
		static int z=40;//allowed
		static {
			System.out.println("hi bbbbb");
		}
		void m2() {
			System.out.println("Hi B");
			 System.out.println(y);
			 System.out.println(x);
			 System.out.println(k);
			 System.out.println(j);
		}
	}
}
public class NonStaticNestedClassEx {
	public static void main(String[] args) {
		System.out.println(A.B.z);
		//B b=new B();//error
		A a=new A();
		System.out.println(a.x);
		a.m1();
		A.B b=a.new B();
		System.out.println(b.y);
		b.m2();
		//System.out.println(b.x);//error
		//System.out.println(a.y);//error
	}
}
