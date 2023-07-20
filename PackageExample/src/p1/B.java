package p1;

public class B {
	public int y=20;
	public void m2() {
		System.out.println("Hello B");
		//A a=new A(); //allowed
		p1.A a=new p1.A();
		System.out.println(a.x);
		//System.out.println(a.g);//error
		System.out.println(a.k);
	}
}
