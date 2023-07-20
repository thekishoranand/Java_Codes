
class AAA {
	final int x=10;
	//final int z;//error
	void m1() {
		//x=80;//error
		System.out.println(x);
		final int y=20;
		//y=80;//error
		System.out.println(y);
	}
	int h;
	void m2() {
		int k;
		System.out.println(h);
		//System.out.println(k);//error
	}
}
public class FinalVariableEx {
	public static void main(String[] args) {
		AAA a = new AAA();
		//a.x=90;//error
		System.out.println(a.x);
		a.m1();
		a.m2();
	}
}