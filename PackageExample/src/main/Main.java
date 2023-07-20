package main;

public class Main {

	public static void main(String[] args) {
		 p1.A a=new p1.A();
		 System.out.println(a.x);
		 //System.out.println(a.g);//error
		 //System.out.println(a.k);//error
		 a.m1();
		 p1.B b=new p1.B();
		 System.out.println(b.y);
		 b.m2();
		 p2.A aa=new p2.A();
		 System.out.println(aa.h);
		 aa.mm();
		 p2.D d=new p2.D();
		 System.out.println(d.z);
		 d.m3();
	}

}
 