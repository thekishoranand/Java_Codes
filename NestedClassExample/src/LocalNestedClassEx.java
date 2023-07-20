class AAA{
	int x=10;
	private int k=10;
	static int j=10;
	void m1() {
		int p=90;
		 System.out.println("Hi A");
		 System.out.println(x);
		 System.out.println(k);
		 System.out.println(j);
		 class B{
			int y=20;
			static int z=90;//allowed
			static {
				System.out.println("hi bbbbb");
			}
			void m2() {
				System.out.println("Hi B");
				 System.out.println(x);
				 System.out.println(k);
				 System.out.println(j);
				 System.out.println(p);
			}
		}
		 System.out.println(B.z);//allowed
		 B b=new B();
		 System.out.println(b.y);
		 b.m2();
	}
	void mmm() {
		//B b=new B();//error
	}
}
public class LocalNestedClassEx {
	public static void main(String[] args) {
		//B b=new B();//error
		AAA a=new AAA();
		a.m1();
	}
}

