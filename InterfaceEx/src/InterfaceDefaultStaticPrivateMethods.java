interface AA{
	int x=10;
	void m1();
	default void xyz() {
		System.out.println("XYZ");
		mno();
		ijk();
	}
	static void pqr() {
		System.out.println("PQR");
		ijk();
		//mno();//error
	}
	private void mno() {
		System.out.println("MNO");
	}
	private static void ijk() {
		System.out.println("IJK");
	}
}
class BB{
	void abc() {
		System.out.println("ABC");
	}
}
class XX extends BB implements AA{
	public void m1() {
		System.out.println("Hello X");
		xyz();
	}
}
class YY implements AA{
	public void m1() {
		System.out.println("Hello Y");
		xyz();
	}
}
public class InterfaceDefaultStaticPrivateMethods {
	public static void main(String[] args) {
		System.out.println(AA.x);
		AA.pqr();
		AA aa=new XX();
		//a.pqr();//error
		aa.m1();
		aa.xyz();
		System.out.println(aa.x);//allowed
		aa=new YY();
		aa.m1();
		aa.xyz();
	}
}
