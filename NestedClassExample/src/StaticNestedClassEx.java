class AA{
	int x=10;
	private int k=20;
	static int j=30;
	void m1() {
		 System.out.println("Hi A");
		 System.out.println(x);
		 System.out.println(k);
		 System.out.println(j);
		 System.out.println(B.z);
		 B b=new B();
		 System.out.println(b.y);
		 b.m2();
	}
	static class B{
		int y=20;
		static int z=20;
		static {
			System.out.println("hi bbbbb");
		}
		void m2() {
			System.out.println("Hi B");
			 //System.out.println(x);//error
			 //System.out.println(k);//error
			 System.out.println(j);
		}
	}
}
public class StaticNestedClassEx {
	public static void main(String[] args) {
		 System.out.println(AA.B.z);
		 //B b=new B();//error
		AA.B b=new AA.B();
		System.out.println(b.y);
		b.m2();
	}
}
