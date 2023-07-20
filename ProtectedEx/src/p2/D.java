package p2;
import p1.A;
public class D extends A{
	public void m() {
		A a=new A();
		//System.out.println(a.x);//error
		System.out.println(x);
	}
}
