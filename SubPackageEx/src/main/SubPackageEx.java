package main;
import p1.A;
import p1.p2.B;
public class SubPackageEx {

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.y);
		A a=new A();
		a.m1();
	}
}
